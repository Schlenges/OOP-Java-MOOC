package movable;

import java.util.List;
import java.util.ArrayList;

public class Group implements Movable{
  private List<Movable> group = new ArrayList<Movable>();

  public void addToGroup(Movable movable){
    group.add(movable);
  }

  public String toString(){
    String string = "";
    for(Movable movable : group){
      string += movable + "\n";
    }

    return string;
  }

  @Override
  public void move(int dx, int dy){
    for(Movable m : group){
      m.move(dx, dy);
    }
  }
}