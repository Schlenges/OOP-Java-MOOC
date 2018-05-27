
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double PRICE_OF_ECONOMICAL = 2.50; 
    private static final double PRICE_OF_GOURMET = 4.00; 

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        if(cashGiven >= PRICE_OF_ECONOMICAL){
            //    the price of lunch is added to register
            this.cashInRegister += PRICE_OF_ECONOMICAL;
            //    the amount of sold lunch is incremented by one
            this.economicalSold++;
            //    method returns cashGiven - lunch price 
            return cashGiven - PRICE_OF_ECONOMICAL;
        }
               
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        if(cashGiven >= PRICE_OF_GOURMET){
            //    the price of lunch is added to register
            this.cashInRegister += PRICE_OF_GOURMET;
            //    the amount of sold lunch is incremented by one
            this.gourmetSold++;
            //    method returns cashGiven - lunch price 
            return cashGiven - PRICE_OF_GOURMET;
        }
               
        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        if(card.balance() >= PRICE_OF_ECONOMICAL){
            card.pay(PRICE_OF_ECONOMICAL);
            //    the amount of sold lunches is incremented by one
            this.economicalSold++;
            //    the method returns true
            return true;
        }
    
        // if not, the method returns false
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        if(card.balance() >= PRICE_OF_GOURMET){
            card.pay(PRICE_OF_GOURMET);
            //    the amount of sold lunches is incremented by one
            this.gourmetSold++;
            //    the method returns true
            return true;
        }

        // if not, the method returns false
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if(sum > 0){
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
