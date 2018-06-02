package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer{
  private int boxesVolume;

  public Packer(int boxesVolume){
    this.boxesVolume = boxesVolume;
  }

  public List<Box> packThings(List<Thing> things){
    List<Box> boxes = new ArrayList<Box>();
    Box box = new Box(this.boxesVolume);

    for(Thing thing : things){
      if(box.addThing(thing) == false){
        boxes.add(box);
        box = new Box(this.boxesVolume);
        box.addThing(thing);
      }
    }

    boxes.add(box);
    return boxes;
  }

}