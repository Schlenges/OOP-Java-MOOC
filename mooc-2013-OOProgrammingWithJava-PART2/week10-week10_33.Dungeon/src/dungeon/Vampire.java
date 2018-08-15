package dungeon;

import java.util.Random;

public class Vampire{
  private int x;
  private int y;
  private int width;
  private int height;
  private Random random = new Random();

  public Vampire(int width, int height){
    this.width = width;
    this.height = height;
    this.x = random.nextInt(width);
    this.y = random.nextInt(height);
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public void move(){
    int direction = random.nextInt(4) + 1;

    // up
    if(direction == 1 && y > 0){
      y--;
    // down
    } else if(direction == 2 && y < height-1){
      y++;
    // left
    } else if(direction == 3 && x > 0){
      x--;
    //right
    } else if(direction == 4 && x < width-1){
      x++;
    }
  }

  @Override
  public String toString(){
    return x + " " + y;
  }

  @Override
  public boolean equals(Object object){
    boolean equals = false;

    if (object != null && object instanceof Vampire){
      equals = this.toString().equals(object.toString());
    }

    return equals;
  }
  
}