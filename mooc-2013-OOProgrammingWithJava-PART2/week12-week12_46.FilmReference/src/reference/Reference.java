package reference;

import java.util.*;
import reference.domain.*;
import reference.comparator.*;

public class Reference{

  private RatingRegister register;
  private List<Film> films;

  public Reference(RatingRegister register){
    this.register = register;
    this.films = new ArrayList<Film>(register.filmRatings().keySet());
  }

  public Film recommendFilm(Person person){
    List<Person> reviewers = register.reviewers();

    if(!reviewers.contains(person)){
      Collections.sort(films, new FilmComparator(register.filmRatings()));
      return films.get(0);
    }

    Map<Person, Integer> compatibilities = getCompatibilities(reviewers, person);

    List<Person> compatibleReviewers = new ArrayList<Person>(compatibilities.keySet());
    Collections.sort(compatibleReviewers, new PersonComparator(compatibilities));

    return getRecommendedFilm(person, compatibleReviewers);    
  }

  private Map<Person, Integer> getCompatibilities(List<Person> reviewers, Person person){
    Map<Film, Rating> personalRatings = register.getPersonalRatings(person);
    Map<Person, Integer> compatibilities = new HashMap<Person, Integer>();

    for(Person reviewer : reviewers){
      if(reviewer == person){
        continue;
      }

      Map<Film, Rating> reviewerRatings = register.getPersonalRatings(reviewer);
      int compatibility = 0;

      for(Film film : reviewerRatings.keySet()){
        if(personalRatings.containsKey(film)){
          compatibility += reviewerRatings.get(film).getValue() * personalRatings.get(film).getValue();
        }
      }

      compatibilities.put(reviewer, compatibility);

    }

    return compatibilities;
  }

  private Film getRecommendedFilm(Person person, List<Person> compatibleReviewers){
    for(Person reviewer : compatibleReviewers){
      if(reviewer == person){
        continue;
      }

      for(Film film : register.getPersonalRatings(reviewer).keySet()){
        if(register.getPersonalRatings(person).keySet().contains(film)){
          continue;
        }

        if (register.getPersonalRatings(reviewer).get(film).getValue() > 1) {
          return film;
        }
      }
    }

    return null;
  }
}