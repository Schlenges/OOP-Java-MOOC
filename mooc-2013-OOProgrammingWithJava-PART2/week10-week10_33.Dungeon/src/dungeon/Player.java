package dungeon;

public class Player{
  private int x;
  private int y;
  private int width;
  private int height;

  public Player(int width, int height){
    this.width = width;
    this.height = height;
    this.x = 0;
    this.y = 0;
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public void move(char command){
    if(command == 'w' && y > 0){
      y--;
    } else if(command == 's' && y < height-1){
      y++;
    } else if(command == 'a' && x > 0){
      x--;
    } else if(command == 'd' && x < width-1){
      x++;
    }
  }

  @Override
  public String toString(){
    return x + " " + y;
  }

}