package movingfigure;

import java.util.ArrayList;
import java.awt.Graphics;

public class CompoundFigure extends Figure{
  private ArrayList<Figure> figures;

  public CompoundFigure(){
    super(0, 0);
    figures = new ArrayList<Figure>();
  }

  public void add(Figure f){
    figures.add(f);
  }

  @Override
  public void draw(Graphics graphics){
    for(Figure f : figures){
      f.draw(graphics);
    }
  }

  @Override
  public void move(int dx, int dy){
    for(Figure f : figures){
      f.move(dx, dy);
    }
  }
}