package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
  private Map<String, Set<String>> translations;

  public PersonalMultipleEntryDictionary(){
    this.translations = new HashMap<String, Set<String>>();
  }
  
  @Override
  public void add(String word, String entry){
    if(!this.translations.containsKey(word)){
      translations.put(word, new HashSet<String>());
    }

    this.translations.get(word).add(entry);
  }

  @Override
  public Set<String> translate(String word){
    return this.translations.get(word);
  }

  @Override
  public void remove(String word){
    this.translations.remove(word);
  }
}