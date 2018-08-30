package reference;

import java.util.*;
import reference.domain.*;
import reference.comparator.*;

public class Reference{
  private RatingRegister register;
  private Map<Film, List<Rating>> ratings;
  private List<Film> films;

  public Reference(RatingRegister register){
    this.register = register;
    this.ratings = register.filmRatings();
    films = new ArrayList<Film>();
    
    for(Film film : ratings.keySet()){
      films.add(film);
    }
  }

  public Film recommendFilm(Person person){
    List<Person> reviewers = register.reviewers();

    if(!reviewers.contains(person)){
      Collections.sort(films, new FilmComparator(ratings));
      return films.get(0);
    }

    Map<Film, Rating> personalRatings = register.getPersonalRatings(person);
    int compatibility = 0;
    Person compatiblePerson = reviewers.get(0);

    for(Person reviewer : reviewers){
      if(reviewer == person){
        continue;
      }

      Map<Film, Rating> reviewerRatings = register.getPersonalRatings(reviewer);
      int temp = 0;

      for(Film film : reviewerRatings.keySet()){
        if(personalRatings.containsKey(film) && personalRatings.get(film) != Rating.NOT_WATCHED){
          temp += reviewerRatings.get(film).getValue() * personalRatings.get(film).getValue();
        }
      }

      if(temp > compatibility || compatibility == 0){
        compatibility = temp;
        compatiblePerson = reviewer;
      }
    }

    List<Film> recommended = new ArrayList<Film>();
    for(Film film : register.getPersonalRatings(compatiblePerson).keySet()){
      recommended.add(film);
    }

    Collections.sort(recommended, new RatingComparator(register.getPersonalRatings(compatiblePerson)));

    Film recommendedFilm = recommended.get(0);

    for(Film film : recommended){
      if(!register.getPersonalRatings(person).containsKey(film) || register.getPersonalRatings(person).get(film) == Rating.NOT_WATCHED){
        recommendedFilm = film;
        break;
      }
    }

    return recommendedFilm;
  }
}