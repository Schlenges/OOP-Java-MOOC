package boxes;

import java.util.Collection;
import java.util.ArrayList;

public class BlackHoleBox extends Box{
  private Collection<Thing> things;

  public BlackHoleBox(){
    this.things = new ArrayList<Thing>();
  }

  @Override
  public void add(Thing thing){
    things.add(thing);
  }

  @Override
  public boolean isInTheBox(Thing thing){
    return false;
  }
}