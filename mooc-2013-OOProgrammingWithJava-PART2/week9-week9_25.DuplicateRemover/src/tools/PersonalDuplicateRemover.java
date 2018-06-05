package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover{
  private int countDuplicates;
  private Set<String> words;

  public PersonalDuplicateRemover(){
    this.countDuplicates = 0;
    this.words = new HashSet<String>();
  }

  public void add(String characterString){
    if(words.contains(characterString)){
      countDuplicates++;
    }

    words.add(characterString);
  }

  public int getNumberOfDetectedDuplicates(){
    return countDuplicates;
  }
  
  public Set<String> getUniqueCharacterStrings(){
    return words;
  }
  
  public void empty(){
    words.clear();
    countDuplicates = 0;
  }
  
}