/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
public class Counter {
    private int counter;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        // creates a new counter with the given value. The check is on if the parameter given to check was true.
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        // creates a new counter with the given value. The check on the new counter should be off.
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        //creates a new counter with the starting value 0. The check is on if the parameter given to check was true.
        this(0, check);
    }
    
    public Counter(){
        // creates a new counter with the starting value of 0 and with checking off.
        this(0, false);
    }
    
     public int value(){
        // returns the current value of the counter
        return this.counter;
    }
    
    public void increase(){
        // increases the value of the counter by one    
        this.increase(1);
    } 
    
    public void increase(int increaseAmount){
        if(increaseAmount >= 0){
            this.counter += increaseAmount;
        }
    }
    
    public void decrease(){
        // decreases the value of the counter by one, but not below 0 if the check is on
        this.decrease(1);
    } 
    
    public void decrease(int decreaseAmount){
        /*
        if(decreaseAmount >= 0){
            int decreased = this.counter - decreaseAmount;
            if(this.check){
                if(decreased >= 0){
                    this.counter = decreased;
                } else {
                    this.counter = 0;
                }
            } else {
                this.counter = decreased;
            }
        }
        */
        
        if (decreaseAmount < 0) {
            return;
        }
 
        this.counter -= decreaseAmount;
        
        if (this.check && this.counter < 0) {
            this.counter = 0;
        }          
    }
   

}
