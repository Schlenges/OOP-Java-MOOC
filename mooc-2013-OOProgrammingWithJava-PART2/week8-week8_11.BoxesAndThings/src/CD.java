/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int year;
    private double weight = 0.1;
    
    public CD (String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
}
