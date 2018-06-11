import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre{
  private  Map<Bird, List<String>> birds;

  public RingingCentre(){
    this.birds = new HashMap<Bird, List<String>>();
  }

  public void observe(Bird bird, String place){
    if(!birds.containsKey(bird)){
      birds.put(bird, new ArrayList<String>());
    }

    birds.get(bird).add(place);
  }

  public void observations(Bird bird){
    if(!birds.containsKey(bird)){
      System.out.println(bird + " observations: 0");
      return;
    }

    System.out.println(bird + " observations: " + birds.get(bird).size());
    for(String place : birds.get(bird)){
      System.out.println(place);
    }
  }
}