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
    Collections.sort(films, new FilmComparator(ratings));
    return films.get(0);

/*     Map<Film, Rating> personalRatings = register.getPersonalRatings(person); */

/*     for(Film film : films){
      System.out.println(personalRatings);
    } */
  }
}