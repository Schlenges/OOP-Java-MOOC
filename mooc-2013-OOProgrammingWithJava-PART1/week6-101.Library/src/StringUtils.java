/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
public class StringUtils {
    
    public static boolean included(String word, String searched){
        // checks if the string searched is contained within the string word
        // if either string is null, return false
        //The methods trim and toUpperCase() of the class String might be helpful.
        if(word == null || searched == null){
            return false;
        }
        
        searched = searched.trim().toUpperCase();
        word = word.toUpperCase();
        
        return word.contains(searched);
    }
}
