package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.Direction;

public class Worm{
  private List<Piece> pieces;
  private int x;
  private int y;
  private Direction direction;
  private boolean grows;

  public Worm(int originalX, int originalY, Direction originalDirection){
    pieces = new ArrayList<Piece>();
    pieces.add(new Piece(originalX, originalY));
    x = originalX;
    y = originalY;
    direction = originalDirection;
    grows = true;
  }

  public Direction getDirection(){
    return direction;
  }

  public void setDirection(Direction dir){
    direction = dir;
  }

  public int getLength(){
    return pieces.size();
  }

  public List<Piece> getPieces(){
    return pieces;
  }

  public Piece getHeadPiece(){
    return pieces.get(getLength()-1);
  }

  public void move(){

    if(getLength() >= 3 && grows == false){
      pieces.remove(0);
    }

    switch(this.direction){
      case RIGHT:
        x++;
        pieces.add(new Piece(x, y));
        break;
      case LEFT:
        x--;
        pieces.add(new Piece(x, y));
        break;
      case UP:
        y--;
        pieces.add(new Piece(x, y));
        break;
      case DOWN:
        y++;
        pieces.add(new Piece(x, y));
        break;
    }

    grows = false;
  }

  public void grow(){
    grows = true;
  }

  public boolean runsInto(Piece piece){
    for(Piece wormPiece : pieces){
      if(wormPiece.runsInto(piece)){
        return true;
      }
    }

    return false;
  }

  public boolean runsIntoItself(){
    boolean crash = false;

    for(int i = 0; i < pieces.size()-1; i++){
      for(int j = i+1; j < pieces.size(); j++){
        if(pieces.get(i).runsInto(pieces.get(j))){
          crash = true;
          break;
        }
      }
    }

    return crash;
  }
}