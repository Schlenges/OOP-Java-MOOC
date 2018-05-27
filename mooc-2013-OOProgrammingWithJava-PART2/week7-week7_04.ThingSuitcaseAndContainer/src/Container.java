/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author meike
 */
public class Container {
    private ArrayList<Suitcase> container;
    private int maxWeight;
    
    public Container(int maxWeight){
        this.container = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(containerWeight() + suitcase.totalWeight() <= this.maxWeight){
            container.add(suitcase);
        }
    }
    
    public int containerWeight(){
        int containerWeight = 0;
        for(Suitcase suitcase : container){
            containerWeight += suitcase.totalWeight();
        }
        
        return containerWeight;
    }
    
    public String toString(){
        return container.size() + " suitcases (" + containerWeight() + " kg)";
    }
    
    public void printThings(){
        for(Suitcase suitcase : container){
            suitcase.printThings();
        }
    }
}
