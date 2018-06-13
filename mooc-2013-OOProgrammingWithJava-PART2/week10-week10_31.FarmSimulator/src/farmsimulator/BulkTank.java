package farmsimulator;

import java.lang.Math;

public class BulkTank{
  private double capacity;
  private double volume;

  public BulkTank(){
    this.capacity = 2000.00;
  }

  public BulkTank(double capacity){
    this.capacity = capacity;
  }

  public double getCapacity(){
    return capacity;
  }

  public double getVolume(){
    return volume;
  }

  public double howMuchFreeSpace(){
    return capacity - volume;
  }

  public void addToTank(double amount){
    if(volume + amount > capacity){
      amount = capacity - volume;
    }

    volume += amount;
  }

  public double getFromTank(double amount){
    if(volume - amount < 0){
      amount -= volume;
      volume = 0;
    } else {
      volume -= amount;
    }
    
    return amount;
  }

  @Override
  public String toString(){
    return Math.ceil(volume) + "/" + Math.ceil(capacity);
  }
}