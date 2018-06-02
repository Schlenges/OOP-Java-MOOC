package moving.domain;

import java.util.List;
import java.util.ArrayList;

public class Box implements Thing{
  private List<Thing> box;
  private int maxCapacity;

  public Box(int maximumCapacity){
    this.box = new ArrayList<Thing>();
    this.maxCapacity = maximumCapacity;
  }

  public boolean addThing(Thing thing){
    if(getVolume() + thing.getVolume() > this.maxCapacity){
      return false;
    }

    box.add(thing);
    return true;
  }

  @Override
  public int getVolume(){
    int totalVolume = 0;

    for(Thing thing : box){
      totalVolume += thing.getVolume();
    }

    return totalVolume;
  }

}