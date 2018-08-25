package movingfigure;

import java.awt.Graphics;

public class Box extends Figure{
  private int height;
  private int width;

  public Box(int x, int y, int width, int height){
    super(x, y);
    this.height = height;
    this.width = width;
  }

  @Override
  public void draw(Graphics graphics){
    graphics.fillRect(getX(), getY(), width, height);
  }
}