package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{
  private String name;
  private int capacity;
  private double amount;

  private static final String[] NAMES = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

  public Cow(){
    int i = new Random().nextInt(NAMES.length + 1);
    this.name = NAMES[i];
    this.capacity = 15 + new Random().nextInt(26);
  }


  public Cow(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }


  public double getCapacity(){
    return capacity;
  }

  public double getAmount(){
    return amount;
  }

  @Override
  public String toString(){
    return name + " " + Math.ceil(amount) + "/" + capacity;
  }

  @Override
  public double milk(){
    double milk = amount;
    amount = 0;
    return milk;
  }

  @Override
  public void liveHour(){
    double produced = (double) (7 + new Random().nextInt(14)) / 10;

    if(amount + produced > capacity){
      amount = capacity;
    } else {
      amount += produced;
    }
  }
}