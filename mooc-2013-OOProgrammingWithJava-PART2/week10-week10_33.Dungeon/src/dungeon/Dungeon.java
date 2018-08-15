package dungeon;

import java.util.*;

public class Dungeon {
  private int length;
  private int height;
  private int moves;
  private boolean vampiresMove;
  private Scanner reader = new Scanner(System.in);

  private List<Vampire> vampires = new ArrayList<Vampire>();
  private Player player;

  public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
    this.length = length;
    this.height = height;
    this.moves = moves;
    this.vampiresMove = vampiresMove;
    this.player = new Player(length, height);

    for(int i = 0; i < vampires; i++){
      Vampire vampire = new Vampire(length, height);

      while(this.vampires.contains(vampire) || (vampire.getX() == 0 && vampire.getY() == 0)){
        vampire = new Vampire(length, height);
      }

      this.vampires.add(vampire);
    }
  }

  public void run(){
    while(true){
      if(vampires.isEmpty()){
        System.out.println("YOU WIN");
        break;
      }

      if(moves == 0){
        System.out.println("YOU LOSE");
        break;
      }

      printStats();
      printMap();

      makeMove();
      moves--;
    }
  }

  public void printStats(){
    System.out.println(moves);
    System.out.println();
    System.out.println("@ " + player);
    for(Vampire vampire : vampires){
      System.out.println("v " + vampire);
    }
    System.out.println();
  }

  public void printMap(){
    int rowCount = 0;

    while(rowCount < height){
      int lineCount = 0;
      String line = "";
      List<Integer> v = new ArrayList<Integer>();
      boolean playerInRow = false;

      if(player.getY() == rowCount){
        playerInRow = true;
      }

      for(Vampire vampire : vampires){
        if(vampire.getY() == rowCount){
          v.add(vampire.getX());
        }
      }

      while(lineCount < length){
        if(playerInRow && player.getX() == lineCount){
          line += "@";
        } else if(v.contains(lineCount)){
          line += "v";
        } else{
          line += ".";
        }
        
        lineCount++;
      }

      System.out.println(line);
      rowCount++;
    }
  }

  public void makeMove(){
    char[] commands = reader.nextLine().toLowerCase().toCharArray();

    for(char command : commands){
      player.move(command);

      for(int i = 0; i < vampires.size(); i++){
        Vampire vampire = vampires.get(i);

        if(vampiresMove){
          vampire.move();
        }
        
        if(vampire.toString().equals(player.toString())){
          vampires.remove(i);
        }
      }

    }
  }

}