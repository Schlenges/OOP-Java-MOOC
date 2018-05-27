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
        
public class Changer {
    private ArrayList<Change> changes;
    
    public Changer(){
        this.changes =  new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        // adds a new Change to the Changer
        this.changes.add(change);
    }
    
    public String change(String characterString){
        //executes all added Changes for the character string in the order of their adding and returns the changed character string
        String changedString = characterString;
        for(Change item : changes){
            changedString = item.change(changedString);
        }
        
        return changedString;
    }

}
