/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author meike
 */
public class Jumper implements Comparable<Jumper>{
  private String name;
  private Score score;
  private List<Integer> jumps;
  
  public Jumper(String name){
    this.name = name;
    this.score = new Score();
    this.jumps = new ArrayList<Integer>();
  }
  
  public String getName(){
      return this.name;
  }
  
  public Score getScore(){
      return this.score;
  }

  public int getTotalScore(){
    return getScore().getTotalPoints();
  }

  public void setScore(){
    score.setTotalPoints();
  }

  public void addJump(){
    jumps.add(score.getLengthPoints());
  }

  public List getJumps(){
    return this.jumps;
  }
  
  @Override
  public String toString(){
      return this.name + " (" + this.getTotalScore() + " points)";
  }

  @Override
  public int compareTo(Jumper jumper){
    return this.getTotalScore() - jumper.getTotalScore();
  }
}
