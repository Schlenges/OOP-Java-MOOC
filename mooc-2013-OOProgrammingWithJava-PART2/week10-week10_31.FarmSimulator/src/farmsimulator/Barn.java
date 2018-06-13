package farmsimulator;

import java.util.Collection;
import java.lang.IllegalStateException;

public class Barn{
  private BulkTank barnTank;
  private MilkingRobot milkingRobot;

  public Barn(BulkTank tank){
    this.barnTank = tank;
  }

  public BulkTank getBulkTank(){
    return barnTank;
  }

  public void installMilkingRobot(MilkingRobot robot){
    this.milkingRobot = robot;
    milkingRobot.setBulkTank(barnTank);
  }

  public void takeCareOf(Cow cow){
    if(milkingRobot == null){
      throw new IllegalStateException();
    }

    milkingRobot.milk(cow);
  }

  public void takeCareOf(Collection<Cow> cows){
    for(Cow cow : cows){
      milkingRobot.milk(cow);
    }
  }

  @Override
  public String toString(){
    return barnTank.toString();
  }
}