/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
import java.util.ArrayList;
        
public class Library {
    private ArrayList<Book> library;
    
    public Library(){
        library = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        library.add(newBook);
    }
    
    public void printBooks(){
        for(Book book : library){
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        return this.search(title, null, -1);
    }
            
    public ArrayList<Book> searchByPublisher(String publisher){
        return this.search(null, publisher, -1);
    }
    
    public ArrayList<Book> searchByYear(int year){
        return this.search(null, null, year);
    }
    
    public ArrayList<Book> search(String title, String publisher, int year){
        ArrayList<Book> result = new ArrayList<Book>();
        
        for(Book book : library){
            if(StringUtils.included(book.title(), title)
                    || StringUtils.included(book.publisher(), publisher)
                    || book.year() == year){
                
                result.add(book);
            }
        }
        
        return result;
    }
    
}
