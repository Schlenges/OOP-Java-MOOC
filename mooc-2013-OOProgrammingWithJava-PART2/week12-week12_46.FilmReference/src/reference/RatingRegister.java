package reference;

import reference.domain.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class RatingRegister{
  private Map<Film, List<Rating>> register;

  public RatingRegister(){
    register = new HashMap<Film, List<Rating>>();
  }

  public void addRating(Film film, Rating rating){
    if(!register.containsKey(film)){
      List<Rating> ratings = new ArrayList<Rating>();
      ratings.add(rating);
      register.put(film, ratings);
    } else {
      register.get(film).add(rating);
    }
  } 

  public List<Rating> getRatings(Film film){
    // returns a list of the ratings which were added in connection to a film.
    if(!register.containsKey(film)){
      return null;
    }

    return register.get(film);
  }

  public Map<Film, List<Rating>> filmRatings(){
    return register;
    // returns a map whose keys are the evaluated films. Each film is associated to a list containing the ratings for that film.
  }
}