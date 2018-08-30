package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import reference.domain.*;

public class FilmComparator implements Comparator<Film>{
  
  private Map<Film, List<Rating>> movies;

  public FilmComparator(Map<Film, List<Rating>> ratings){
    movies = ratings;
  }

  public Integer getAverage(Film film){
    List<Rating> ratings = movies.get(film);
    Integer average = 0;

    for(Rating rating : ratings){
      average += rating.getValue();
    }

    average /= ratings.size();
    return average;
  }

  @Override
  public int compare(Film one, Film two){
    return getAverage(two).compareTo(getAverage(one));
  }
}