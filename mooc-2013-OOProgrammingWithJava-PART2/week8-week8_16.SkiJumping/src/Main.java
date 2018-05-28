import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Participants participants = new Participants();

        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        // First, the simulator asks the user for the jumper names
        // If the user inputs an empty string (i.e. presses enter), we move to the jumping phase
        
        System.out.print("  Participant name: ");
        String name = reader.nextLine();
        
        while(!name.equals("")){
            participants.add(new Jumper(name));
            System.out.print("  Participant name: ");
            name = reader.nextLine();
        }
        
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
        System.out.println("Write \"jump\" to jump; otherwise you quit: ");
        String command = reader.nextLine();
        
        while(command.equals("jump")){
            // do something
            participants.sort();
            
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            command = reader.nextLine();
        }
        
        // jumpers jump one by one in reverse order according to their points. The jumper with the less points always jumps first

        // total points of a jumper are calculated by adding up the points from their jumps

        // Jump points are decided in relation to the jump length (use a random integer between 60-120) and judge decision

        // Five judges vote for each jump (a vote is a random number between 10-20)

        // The judge decision takes into consideration only three judge votes: the smallest and the greatest votes are not taken into account.

        // There are as many rounds as the user wants. When the user wants to quit, we print the tournament results

        // The tournament results include the jumpers, the jumper total points, and the lengths of the jumps

        // The final results are sorted against the jumper total points, and the jumper who received the most points is the first.

        // it would be good to arrive to a situation where your user interface is the only class with printing statements.
    }
}
