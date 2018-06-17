package dungeon;

public class Dungeon{
  private int length;
  private int height;
  private int vampires;
  private int moves;
  private boolean vampiresMove;

  public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
    this.length = length;
    this.height = height;
    this.vampires = vampires;
    this.moves = moves;
    this.vampiresMove = vampiresMove; 
  }

  public void run(){
    Map map = new Map(height, length, vampires);
    map.createVampires(vampires);
    map.print();
    System.out.println("-------------");
    map.moveVamps(3);
    map.print();
  }

  
  }