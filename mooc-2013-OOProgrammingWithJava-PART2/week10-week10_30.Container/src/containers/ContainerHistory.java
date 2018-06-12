package containers;

import java.util.ArrayList;
import java.lang.Math;

public class ContainerHistory{
  private ArrayList<Double> history;

  public ContainerHistory(){
    this.history = new ArrayList<Double>();
  }

  public void add(double situation){
    history.add(situation);
  }

  public void reset(){
    history.clear();
  }

  public String toString(){
    return history.toString();
  }

  public double maxValue(){
    if(history.isEmpty()){
      return 0;
    }

    double max = history.get(0);
    for(double value : history){
      if(value > max){
        max = value;
      }
    }

    return max;
  }

  public double minValue(){
    if(history.isEmpty()){
      return 0;
    }

    double min = history.get(0);
    for(double value : history){
      if(value < min){
        min = value;
      }
    }

    return min;
  }

  public double average(){
    if(history.isEmpty()){
      return 0;
    }

    double values = 0;
    for(double value : history){
      values += value;
    }

    return values / history.size();
  }

  public double greatestFluctuation(){
    if(history.size() < 2){
      return 0;
    }

    double temp = history.get(0);
    double greatest = 0;
    for(int i = 1; i < history.size(); i++){
      double fluc = temp - history.get(i);
      temp = history.get(i);
      if(Math.abs(fluc) > greatest){
        greatest = Math.abs(fluc);
      }
    }

    return greatest;
  }

  public double variance(){
    if(history.size() < 2){
      return 0;
    }
    
    double sumDiffsSquared = 0;
    for(double value : history){
        double diff = value - this.average();
        diff *= diff;
        sumDiffsSquared += diff;
    }

    return sumDiffsSquared  / (history.size()-1);
  }
}