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

  public Worm(int x, int y, Direction direction){
    this.x = x;
    this.y = y;
    this.direction = direction;
    this.pieces = new ArrayList<Piece>();
    this.pieces.add(new Piece(x, y));
    this.grows = true;
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

    if(getLength() > 2 && !grows){
      pieces.remove(0);
    }

    if(direction == Direction.RIGHT){
        x++;
    } else if(direction == Direction.LEFT){
        x--;
    } else if(direction == Direction.UP){
        y--;
    } else{
        y++;
    }

    pieces.add(new Piece(x, y));
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

    for(int i = 0; i < pieces.size()-1; i++){
      for(int j = i + 1; j < pieces.size(); j++){
        if(pieces.get(i).runsInto(pieces.get(j))){
          return true;
        }
      }
    }

    return false;
  }

}