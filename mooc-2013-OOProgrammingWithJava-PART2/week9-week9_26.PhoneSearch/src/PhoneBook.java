import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class PhoneBook{
  private Map<String, Person> phoneBook;

  public PhoneBook(){
    this.phoneBook = new HashMap<String, Person>();
  }

  public void addNumber(String name, String number){
    if(!phoneBook.containsKey(name)){
      phoneBook.put(name, new Person(name));
    }

    phoneBook.get(name).addNumber(number);
  }

  public Set<String> searchNumbers(String name){
    if(!phoneBook.containsKey(name)){
      return null;
    }
    return phoneBook.get(name).getNumbers();
  }

  public void printNumbers(String name){
    if(searchNumbers(name) == null){
      System.out.println(" not found");
      return;
    }

    for(String number : searchNumbers(name)){
      System.out.println("   " + number);
    }
  }

  public String personByNumber(String number){
    for(String name : phoneBook.keySet()){
      if(searchNumbers(name).contains(number)){
        return name;
      }
    }
    return "not found";
  }

  public void addAddress(String name, String address){
    if(!phoneBook.containsKey(name)){
      phoneBook.put(name, new Person(name));
    }

    phoneBook.get(name).addAddress(address);
  }

  public void getAllInfo(String name){
    if(!phoneBook.containsKey(name)){
      System.out.println("  not found");
      return;
    }

    Person person = phoneBook.get(name);

    if(person.getAddress() == null){       
      System.out.println("  address unknown");
    } else{
      System.out.println("  address: " + person.getAddress());
    }

    if(person.getNumbers().isEmpty()){
      System.out.println("  phone number not found");
    } else {
      System.out.println("  phone numbers:");
      printNumbers(name);
    } 
  }

  public void deleteAll(String name){
    phoneBook.remove(name);
  }

  public void searchByKeyword(String keyword){
    List<String> results = new ArrayList<String>();
    keyword = keyword.toLowerCase();

    for(String name : phoneBook.keySet()){
      if(name.toLowerCase().contains(keyword) || (phoneBook.get(name).getAddress() != null && phoneBook.get(name).getAddress().toLowerCase().contains(keyword))){
        results.add(name);
      }
    }

    if(results.isEmpty()){
      System.out.println("not found");
      return;
    }

    Collections.sort(results);
    for(String entry : results){
      System.out.println("");
      System.out.println(" " + entry);
      getAllInfo(entry);
    }
  }

}