package reference;

import reference.domain.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class RatingRegister{

  private Map<Film, List<Rating>> register;
  private Map<Person, Map<Film, Rating>> personalRatings;

  public RatingRegister(){
    register = new HashMap<Film, List<Rating>>();
    personalRatings = new HashMap<Person, Map<Film, Rating>>();
  }

  public void addRating(Film film, Rating rating){
    if(!register.containsKey(film)){
      register.put(film, new ArrayList<Rating>());
    }

    register.get(film).add(rating);
  } 

  public List<Rating> getRatings(Film film){
    return register.get(film);
  }

  public Map<Film, List<Rating>> filmRatings(){
    return register;
  }

  public void addRating(Person person, Film film, Rating rating){
    Map<Film, Rating> ratings = new HashMap<Film, Rating>();

    if(!personalRatings.containsKey(person)){
      personalRatings.put(person, ratings);
    }

    ratings = personalRatings.get(person);
      
    if(ratings.containsKey(film)){
      return;
    }

    ratings.put(film, rating);
    addRating(film, rating);
  }

  public Rating getRating(Person person, Film film){
    if(!personalRatings.containsKey(person)){
      return null;
    }

    Map<Film, Rating> ratings = personalRatings.get(person);
    if(!ratings.containsKey(film)){
      return Rating.NOT_WATCHED;
    }

    return ratings.get(film);
  }

  public Map<Film, Rating> getPersonalRatings(Person person){
    if(!personalRatings.containsKey(person)){
      return new HashMap<Film, Rating>();
    }

    return personalRatings.get(person);
  }

  public List<Person> reviewers(){
    return new ArrayList<Person>(personalRatings.keySet());
  }

}