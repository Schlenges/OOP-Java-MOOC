/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author meike
 */
public class Score {
  private Random random = new Random();
  private int[] votes = new int[5];
  private int totalPoints = 0;
  private int length = 0;
  
  public void setLengthPoints(){
    length = random.nextInt((120 - 60) + 1) + 60;
  }

  public int getLengthPoints(){
    return length;
  }

  public void vote(){
    for(int i = 0; i < 5; i++){
      votes[i] = random.nextInt((20 - 10) + 1) + 10;
    }

    Arrays.sort(votes);
  }

  public int judgePoints(){
    int judgePoints = 0;
    this.vote();
    
    for(int i = 1; i < 4; i++){
      judgePoints += votes[i];
    }

    return judgePoints;
  }

  public int roundPoints(){
    setLengthPoints();
    int roundPoints = getLengthPoints() + judgePoints();
    return roundPoints;
  }

  public void setTotalPoints(){
    this.totalPoints += roundPoints();
  }

  public int getTotalPoints(){
    return this.totalPoints;
  }

  public List getVotes(){
    List<Integer> allVotes = new ArrayList<Integer>();
    for(int i = 0; i < votes.length; i++){
      allVotes.add(votes[i]);
    }

    return allVotes;
  }

  @Override
  public String toString(){
    return "    length: " + this.length + "\n    judge votes: " + this.getVotes();
  }
}