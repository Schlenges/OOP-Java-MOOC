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
      List<Rating> ratings = new ArrayList<Rating>();
      ratings.add(rating);
      register.put(film, ratings);
    } else {
      register.get(film).add(rating);
    }
  } 

  public List<Rating> getRatings(Film film){
    if(!register.containsKey(film)){
      return null;
    }

    return register.get(film);
  }

  public Map<Film, List<Rating>> filmRatings(){
    return register;
  }

  public void addRating(Person person, Film film, Rating rating){
    // adds the rating of a specific film to the parameter person. The same person can recommend a specific film only once.
    // The person rating has also to be added to the ratings connected to all the films.
    Map<Film, Rating> ratings = new HashMap<Film, Rating>();

    if(!personalRatings.containsKey(person)){
      ratings.put(film, rating);
      personalRatings.put(person, ratings);
    } else{
      ratings = personalRatings.get(person);
      
      if(!ratings.containsKey(film)){
        ratings.put(film, rating);
      }
    }

    addRating(film, rating);
  }

  public Rating getRating(Person person, Film film){
    // returns the rating the paramater person has assigned to the parameter film. If the person hasn't evaluated such film, the method returns Rating.NOT_WATCHED
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
    // returns a HashMap which contains the person's ratings. The HashMap keys are the evaluated films, and their values are the ratings of these films
    return personalRatings.get(person);
  }

  public List<Person> reviewers(){
    // returns a list of the people who have evaluated the films
    List<Person> reviewers = new ArrayList<Person>();

    for(Person person : personalRatings.keySet()){
      reviewers.add(person);
    }

    return reviewers;
  }
}