import java.util.Set;
import java.util.HashSet;

public class Person{
  private String name;
  private Set<String> numbers;
  private String address;

  public Person(String name){
    this.name = name;
    this.numbers = new HashSet<String>();
  }

  public void addNumber(String number){
    numbers.add(number);
  }

  public void addAddress(String address){
    this.address = address;
  }

  public String getName(){
    return this.name;
  }

  public String getAddress(){
    return this.address;
  }

  public Set<String> getNumbers(){
    return numbers;
  }

}