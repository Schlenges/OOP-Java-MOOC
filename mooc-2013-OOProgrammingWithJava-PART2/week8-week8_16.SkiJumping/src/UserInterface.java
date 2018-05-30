import java.util.*;

public class UserInterface{
  private Scanner reader;
  private Participants participants;

  public UserInterface(Scanner reader, Participants participants){
    this.reader = reader;
    this.participants = participants;
  }

  public void start(){
    System.out.println("Kumpula ski jumping week");
      System.out.println("");
      System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
      
      System.out.print("  Participant name: ");
      String name = reader.nextLine();
      
      while(!name.equals("")){
          participants.add(new Jumper(name));
          System.out.print("  Participant name: ");
          name = reader.nextLine();
      }
      
      System.out.println("");
      System.out.println("The tournament begins!");

      Tournament tournament = new Tournament(participants);

      System.out.println("");
      System.out.print("Write \"jump\" to jump; otherwise you quit: ");
      String command = reader.nextLine();

      while(command.equals("jump")){
          tournament.newRound();
          // jumpers jump one by one in reverse order according to their points. The jumper with the less points always jumps first
          System.out.println("");
          System.out.println("Round " + tournament.getRound());
          System.out.println("");

          participants.sort();

          System.out.println("Jumping order:");
          for(int i = 0; i < participants.numberParticipants(); i++){
              int place = i+1;
              System.out.println("  " + place + ". " + participants.getJumper(i));
          }
          System.out.println();

          participants.jump();

          System.out.println("Results of round " + tournament.getRound());
          for(int i = 0; i < participants.numberParticipants(); i++){
              Jumper jumper = participants.getJumper(i);
              System.out.println("  " + jumper.getName());
              System.out.println(jumper.getScore());
          }

          System.out.println();
          System.out.print("Write \"jump\" to jump; otherwise you quit: ");
          command = reader.nextLine();
      }

      System.out.println();
      System.out.println("Thanks!");
      System.out.println();

      participants.sortByPoints();

      System.out.println("Tournament results:");
      System.out.println("Position    Name");
      for(int i = 0; i < participants.numberParticipants(); i++){
          Jumper jumper = participants.getJumper(i);
          int position = i+1;
          System.out.println(position + "           " + jumper);
          System.out.print("            jump lengths: ");
          for(int j = 0; j < jumper.getJumps().size(); j++){
              List jumps = jumper.getJumps();
              if(j == jumps.size()-1){
                  System.out.print(jumps.get(j) + "m");
              } else{
                  System.out.print(jumps.get(j) + "m, ");
              }
          }
          System.out.print("\n");
      }
  }
}