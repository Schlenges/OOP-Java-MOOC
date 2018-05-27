/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meike
 */
public class LyyraCard {
    private double balance;
    // we define the prices as final variables (usually named with uppercase)
    private final double ECONOMICAL = 2.5;
    private final double GOURMET = 4.0;
    
    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance +" euros";
    }
    
    public void payEconomical() {
        if(this.balance >= ECONOMICAL){
            this.balance -= ECONOMICAL;
        }
    }

    public void payGourmet() {
        if(this.balance >= GOURMET){
            this.balance -= GOURMET;
        }
    }
    
    public void loadMoney(double amount) {
        if(amount > 0){
            this.balance += amount;
        }
        
        /* or:
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        */
        
        if(this.balance > 150.00){
            this.balance = 150.00;
        }
    }
    
}
