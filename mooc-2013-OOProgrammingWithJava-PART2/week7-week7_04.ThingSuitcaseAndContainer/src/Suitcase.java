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
public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase(int weight){
        this.things = new ArrayList<Thing>();
        this.maxWeight = weight;
    }
    
    public void addThing(Thing thing){
        if(this.totalWeight() + thing.getWeight() <= this.maxWeight){
            this.things.add(thing);
        }
    }
    
    public String toString(){
        String lang = "things";
        if(this.things.isEmpty()){
            lang = "empty";
        } else if(this.things.size() == 1){
            lang = "thing";
        }
        
        return this.things.size() + " " + lang + " (" + this.totalWeight() + " kg)";
    }
    
    public void printThings(){
        for(Thing thing : this.things){
            System.out.println(thing.toString());
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Thing thing : things){
            totalWeight += thing.getWeight();
        }
        
        return totalWeight;
    }
    
    public Thing heaviestThing(){
        if(this.things.isEmpty()){
            return null;
        }
        
        Thing heaviest = this.things.get(0);
        
        for(Thing thing : this.things){
            if(thing.getWeight() > heaviest.getWeight()){
                heaviest = thing;
            }
        }
        
        return heaviest;
    }
}
