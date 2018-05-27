/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(20);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        
        box.add(box);
        
        System.out.println(box);
    }
    
    
}
