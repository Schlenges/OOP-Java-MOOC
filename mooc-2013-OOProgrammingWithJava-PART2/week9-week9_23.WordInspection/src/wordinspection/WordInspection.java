package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class WordInspection{
  private Scanner reader;
  private List<String> words;

  public WordInspection(File file) throws FileNotFoundException{
    this.words = readFile(file);
  }

  private List<String> readFile(File file) throws FileNotFoundException{
    this.reader = new Scanner(file);
    List<String> text = new ArrayList<String>();

    while(reader.hasNextLine()){
      text.add(reader.nextLine());
    }

    return text;
  }

  public int wordCount(){
    return words.size();
  }

  public List<String> wordsContainingZ(){
    List<String> zWords = new ArrayList<String>();

    for(String word : words){
      if(word.contains("z")){
        zWords.add(word);
      }
    }

    return zWords;
  }

  public List<String> wordsEndingInL(){
    List<String> lWords = new ArrayList<String>();

    for(String word : words){
      if(word.endsWith("l")){ // word.charAt(word.length()-1) == 'l'
        lWords.add(word);
      }
    }

    return lWords;
  }

  public List<String> palindromes(){
    List<String> palindromes = new ArrayList<String>();

    for(String word : words){
      if(isPalindrome(word)){
        palindromes.add(word);
      }
    }

    return palindromes;
  }

  public boolean isPalindrome(String word){
    int j = word.length() - 1;

    for(int i = 0; i < j; i++){
      if(word.charAt(i) != word.charAt(j)){
        return false;
      }
      j--;
    }

    return true;
  }

  public List<String> wordsWhichContainAllVowels(){
    List<String> vowelWords = new ArrayList<String>();

    for(String word : words){
      if(containsVowels(word)){
        vowelWords.add(word);
      }
    }

    return vowelWords;
  }

  public boolean containsVowels(String word){
    String[] vowels = {"a", "e", "i", "o", "u", "y", "ä", "ö"};

    for(int i = 0; i < vowels.length; i++){
      if(word.indexOf(vowels[i]) < 0){
        return false;
      }
    }

    return true;
  }

}