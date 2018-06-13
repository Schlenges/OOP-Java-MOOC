package farmsimulator;

import java.util.List;
import java.util.ArrayList;

public class Farm implements Alive{
  private String owner;
  private Barn barn;
  private List<Cow> cows;

  public Farm(String name, Barn barn){
    this.owner = name;
    this.barn = barn;
    this.cows = new ArrayList<Cow>();
  }

  public void installMilkingRobot(MilkingRobot robot){
    barn.installMilkingRobot(robot);
  }

  public String getOwner(){
    return owner;
  }

  public void addCow(Cow cow){
    cows.add(cow);
  }

  public void manageCows(){
    barn.takeCareOf(cows);
  }

  @Override
  public void liveHour(){
    for(Cow cow : cows){
      cow.liveHour();
    }
  }

  @Override
  public String toString(){
    String animals = "No cows.";
    if(cows.size() > 0){
      animals = "Animals:";
      for(Cow cow : cows){
        animals += "\n        " + cow;
      }
    }

    return "Farm owner: " + owner + 
            "\nBarn bulk tank: " + barn.toString() +
            "\n" + animals;
  }
}