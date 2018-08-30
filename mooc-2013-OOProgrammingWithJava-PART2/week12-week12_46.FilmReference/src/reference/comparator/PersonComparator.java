package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.*;

public class PersonComparator implements Comparator<Person>{

  private Map<Person, Integer> identities;

  public PersonComparator(Map<Person, Integer> peopleIdentities){
    this.identities = peopleIdentities;
  }

  @Override
  public int compare(Person one, Person two){
    return identities.get(two).compareTo(identities.get(one));
  }
  
}