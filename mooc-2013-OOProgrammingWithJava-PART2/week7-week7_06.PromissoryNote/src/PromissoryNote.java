/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author meike
 */
public class PromissoryNote {
    private HashMap<String, Double> promissory;
    
    public PromissoryNote(){
        this.promissory = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value){
        promissory.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        Double debt = promissory.get(whose);

        if(debt == null){
            return 0;
        }
        
        return debt;
    }
}
