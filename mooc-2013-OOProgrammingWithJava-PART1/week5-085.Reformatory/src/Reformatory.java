public class Reformatory {
    private int measured;

    public int weight(Person person) {
        // return the weight of the person
        this.measured++;
        return person.getWeight();
    }
    
     public void feed(Person person){
         int newWeight = person.getWeight() + 1;
         
         person.setWeight(newWeight);
     }
     
      public int totalWeightsMeasured(){
        return this.measured;  
      }

}
