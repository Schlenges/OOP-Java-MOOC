/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author meike
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
     public TextUserInterface(Scanner reader, Dictionary dictionary){
         this.reader = reader;
         this.dictionary = dictionary;
     }
     
     public void start(){
         System.out.println("Statement:");
         System.out.println("  add - adds a word pair to the dictionary");
         System.out.println("  translate - asks a word and prints its translation");
         System.out.println("  quit - quit the text user interface");
         System.out.println("");
         
         while(true){
            System.out.println("Statement: ");
            String command = reader.nextLine();
            
            if(command.equals("quit")){
               System.out.println("Cheers!");
               break;
            }
            else if(command.equals("add")){
                System.out.println("In Finnish: ");
                String word = reader.nextLine();
                System.out.println("Translation: ");
                String translation = reader.nextLine();
                dictionary.add(word, translation);
            }
            else if(command.equals("translate")){
                System.out.println("Give a word: ");
                String word = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(word));
            }
            else {
                System.out.println("Unknown statement");
            }
            
             System.out.println("");
         }
 
     }
}
