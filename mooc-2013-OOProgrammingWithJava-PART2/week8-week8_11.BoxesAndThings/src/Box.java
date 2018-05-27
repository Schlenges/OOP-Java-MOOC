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
public class Box implements ToBeStored{
    private ArrayList<ToBeStored> things = this.things = new ArrayList<ToBeStored>();
    private double maxWeight;
    
    public Box(double weight){
        this.maxWeight = weight;
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(ToBeStored thing : this.things){
            weight += thing.weight();
        }

        return weight;
    }
    
    public void add(ToBeStored thing){
        if(this.weight() + thing.weight() <= this.maxWeight){
            things.add(thing);;
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + things.size() + " things, total weight " + this.weight() + " kg";
    }
}
