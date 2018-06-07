import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class PhoneBook implements Comparable{
  private Map<String, Set<String>> phoneNumbers;
  private Map<String, String> address;

  public PhoneBook(){
    this.phoneNumbers = new HashMap<String, Set<String>>();
    this.address = new HashMap<String, String>();
  }

  public void addNumber(String person, String number){
    if(!phoneNumbers.containsKey(person)){
      Set<String> numbers = new HashSet<String>();
      phoneNumbers.put(person, numbers);
    }

    phoneNumbers.get(person).add(number);
  }

  public Set<String> getNumbers(String person){
    return phoneNumbers.get(person);
  }

  public void printNumbers(String person){
    if(getNumbers(person) == null){
      System.out.println(" not found");
      return;
    }

    for(String number : getNumbers(person)){
      System.out.println("   " + number);
    }
  }

  public String personByNumber(String number){
    for(String person : phoneNumbers.keySet()){
      if(getNumbers(person).contains(number)){
        return person;
      } else {
        return "not found";
      }
    }

    return "not found";
  }

  public void addAddress(String person, String address){
    this.address.put(person, address);
  }

  public void getAllInfo(String person){
    if(!address.containsKey(person) && !phoneNumbers.containsKey(person)){
      System.out.println("  not found");
    }

    if(address.containsKey(person)){      
      System.out.println("  address: " + address.get(person));
    } else{
      System.out.println("  address unknown");
    }

    if(phoneNumbers.containsKey(person)){
      System.out.println("  phone numbers:");
      printNumbers(person);
    } else {
      System.err.println("  phone number not found");
    } 
  }

  public void deleteAll(String person){
    phoneNumbers.remove(person);
    address.remove(person);
  }

  public void searchByKeyword(String keyword){
    keyword = keyword.toLowerCase();
    for(String person : phoneNumbers.keySet()){
      if(person.toLowerCase().contains(keyword) || address.get(person).toLowerCase().contains(keyword)){
        System.out.println("");
        System.out.println(" " + person);
        getAllInfo(person);
      }
    }
  }

}