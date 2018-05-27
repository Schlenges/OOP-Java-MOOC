
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        int sumEuros = this.euros + added.euros;
        int sumCents = this.cents + added.cents;
        Money sum = new Money(sumEuros, sumCents);
        return sum;
    }
    
    public Money minus(Money subtracted){        
        int euroDiff = this.euros - subtracted.euros;
        int centDiff = this.cents - subtracted.cents;
 
        if (centDiff < 0) {
            euroDiff--;
            centDiff += 100;
        }
 
        if (euroDiff < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euroDiff, centDiff);
    }
    
    
    public boolean less(Money compared){
        
        if(this.euros > compared.euros || (this.euros == compared.euros && (this.cents >= compared.cents))){
            return false;
        }
        
        return true;
    }

}
