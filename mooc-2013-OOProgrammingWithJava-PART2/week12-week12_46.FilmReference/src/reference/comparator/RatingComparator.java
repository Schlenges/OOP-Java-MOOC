package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import reference.domain.*;

public class RatingComparator implements Comparator<Film>{
  private Map<Film, Rating> movies;

  public RatingComparator(Map<Film, Rating> ratings){
    movies = ratings;
  }

  @Override
  public int compare(Film one, Film two){
    return movies.get(one).compareTo(movies.get(two));
  }
}