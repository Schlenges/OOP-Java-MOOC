package boxes;

import java.util.Collection;
import java.util.ArrayList;;

public class MaxWeightBox extends Box{
  private int maxWeight;
  private Collection<Thing> things;

  public MaxWeightBox(int maxWeight){
    this.maxWeight = maxWeight;
    this.things = new ArrayList<Thing>();
  }

  public int getWeight(){
    int weight = 0;

    for(Thing thing : things){
      weight += thing.getWeight();
    }

    return weight;
  }

  @Override
  public void add(Thing thing){
    if(getWeight() + thing.getWeight() <= maxWeight){
      things.add(thing);
    }
  }

  @Override
  public boolean isInTheBox(Thing thing){
    return things.contains(thing);
  }
}