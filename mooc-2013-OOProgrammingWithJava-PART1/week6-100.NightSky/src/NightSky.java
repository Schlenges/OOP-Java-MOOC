/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int stars = 0;
     
    public NightSky(double density){
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine(){
        Random random = new Random();
        
        String line = "";
        
        for(int i = 0; i < this.width; i ++){
            double probability = random.nextDouble();
            
            if(probability > this.density){
                line += " ";
            }else{
                line += "*";
                this.stars += 1;
            }
        }
        
        System.out.println(line);
    }
    
     public void print(){
        this.stars = 0;
        
        for(int i = 0; i < this.height; i++){
            this.printLine();
        }
    }
    
    public int starsInLastPrint(){
        return this.stars;
    }
}
