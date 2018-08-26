package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {
  private Random random;

  public PersonalBoard(int width, int height) {
      super(width, height);
      random = new Random();
  }
    
  @Override
  public void turnToLiving(int x, int y){
    if(!isInRange(x, y)){
        return;
    }

    getBoard()[x][y] = true;
  }

  @Override
  public void turnToDead(int x, int y){
    if(!isInRange(x, y)){
        return;
    }
    
    getBoard()[x][y] = false;
  }

  @Override
  public boolean isAlive(int x, int y){
    if(!isInRange(x, y)){
      return false;
    }
    
    return getBoard()[x][y];
  }

  @Override
  public void initiateRandomCells(double probabilityForEachCell){
    for(boolean[] row : super.getBoard()){
      for(int i = 0; i < row.length; i++){
        row[i] = random.nextDouble() <= probabilityForEachCell;
      }
    }
  }

  @Override
  public int getNumberOfLivingNeighbours(int x, int y){
    int count = 0;
    
    if(isInRange(x, y+1)){
      count += isAlive(x, y+1) ? 1 : 0;
    }
    if(isInRange(x, y-1)){
      count += isAlive(x, y-1) ? 1 : 0;
    }
    if(isInRange(x-1, y)){
      count += isAlive(x-1, y) ? 1 : 0;
    }
    if(isInRange(x-1, y-1)){
      count += isAlive(x-1, y-1) ? 1 : 0;
    }
    if(isInRange(x-1, y+1)){
      count += isAlive(x-1, y+1) ? 1 : 0;
    }
    if(isInRange(x+1, y)){
      count += isAlive(x+1, y) ? 1 : 0;
    }
    if(isInRange(x+1, y-1)){
      count += isAlive(x+1, y-1) ? 1 : 0;
    }
    if(isInRange(x+1, y+1)){
      count += isAlive(x+1, y+1) ? 1 : 0;
    }
    
    return count;
  }
  
  public boolean isInRange(int x, int y){
    if((x < 0 || x > super.getWidth()-1) || (y < 0 || y > super.getHeight()-1)){
      return false;
    }   
    return true;
  }

  @Override
  public void manageCell(int x, int y, int livingNeighbours){    
    if(livingNeighbours < 2 || livingNeighbours > 3){
        turnToDead(x, y);
    }
    if(livingNeighbours == 3){
        turnToLiving(x, y);
    }
  }

}