package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{
  private Random random = new Random();
  private String name;
  private double capacity;
  private double amount;

  private static final String[] NAMES = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

  public Cow(){
    this(NAMES[new Random().nextInt(NAMES.length)]);
  }

  public Cow(String name){
    this.name = name;
    this.capacity = 15 + random.nextInt(26);
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
  public double milk(){
    double milk = amount;
    amount = 0;
    return milk;
  }

  @Override
  public void liveHour(){
    double produced = (double) (7 + random.nextInt(14)) / 10;

    if(amount + produced > capacity){
      amount = capacity;
    } else {
      amount += produced;
    }
  }

  @Override
  public String toString(){
    return name + " " + Math.ceil(amount) + "/" + capacity;
  }
}