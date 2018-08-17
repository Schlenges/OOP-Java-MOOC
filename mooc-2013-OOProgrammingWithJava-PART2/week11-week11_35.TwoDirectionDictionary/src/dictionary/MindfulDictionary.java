package dictionary;

import java.util.*;

public class MindfulDictionary{
  private Map<String, String> dictionary = new HashMap<String, String>();
  private String fileName;

  public MindfulDictionary(){

  }

  public MindfulDictionary(String file){
    this.fileName = file;
  }

  public boolean load(){
    File file = new File(this.fileName);
    
  }

  public void add(String word, String translation){
    if(!(dictionary.containsKey(word))){
      dictionary.put(word, translation);
    }
  }

  public String translate(String word){
    if(dictionary.containsKey(word) || dictionary.containsValue(word)){

      if(dictionary.containsKey(word)){
        return dictionary.get(word);
      }

      if(dictionary.containsValue(word)){
        for(String key : dictionary.keySet()){
          if(dictionary.get(key).equals(word)){
            return key;
          }
        }
      }
    }

    return null;  
  }

  public void remove(String word){

    if(dictionary.containsKey(word)){
      dictionary.remove(word);
    }

    if(dictionary.containsValue(word)){
      String entry = null;

      for(String key : dictionary.keySet()){
        if(dictionary.get(key).equals(word)){
          entry = key;
        }
      }

      dictionary.remove(entry);
    }
  }

}