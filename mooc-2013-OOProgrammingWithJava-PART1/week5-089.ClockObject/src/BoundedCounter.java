
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void setValue(int startAt){
        if((startAt < 0) || (startAt > this.upperLimit)){
            return;
        }
        this.value = startAt;
    }

    public void next() {
        if(this.value < this.upperLimit){
            this.value++;
        } else{
            this.value = 0;
        }
    }
    
    public int getValue() {
        return this.value;
    }

    public String toString() {
        if(this.value < 10){
            return "0" + this.value;
        }
        return "" + this.value;
    }
}
