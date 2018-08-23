package dictionary;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MindfulDictionary{
  private Map<String, String> dictionary;
  private String fileName;

  public MindfulDictionary(){
    dictionary = new HashMap<String, String>();
  }

  public MindfulDictionary(String file){
    this();
    this.fileName = file;
  }

  public boolean load(){
    try{
      Scanner reader = new Scanner(new File(fileName));

      while (reader.hasNextLine()){
        String line = reader.nextLine();
        String[] words = line.split(":");
        
        add(words[0], words[1]);
      }

      reader.close();

    } catch(FileNotFoundException e){
        return false;
      }
    
    return true;
  }

  public void add(String word, String translation){
    if(dictionary.containsKey(word)){
      return;
    }

    dictionary.put(word, translation);
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

  public boolean save(){
    try{
      File file = new File(this.fileName);
      FileWriter writer = new FileWriter(file);
      String text = "";

      for(String key : dictionary.keySet()){
        text += key + ":" + dictionary.get(key) + "\n";
      }

      writer.write(text);
      writer.close();
    } catch(IOException e){
      return false;
    }

    return true;    
  }

}