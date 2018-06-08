import java.util.Scanner;

public class UserInterface{
  private Scanner reader;
  private PhoneBook phonebook;

  public UserInterface(Scanner reader){
    this.reader = reader;
    this.phonebook = new PhoneBook();
  }

  public void start(){ 

    System.out.println("phone search");
    System.out.println("available operations:");
    System.out.println(" 1 add a number");
    System.out.println(" 2 search for a number");
    System.out.println(" 3 search for a person by phone number");
    System.out.println(" 4 add an address");
    System.out.println(" 5 search for personal information");
    System.out.println(" 6 delete personal information");
    System.out.println(" 7 filtered listing");
    System.out.println(" x quit");
    System.out.println("");
    
    System.out.print("command: ");
    String input = reader.nextLine();

    while(!input.equals("x")){
      
      if(input.equals("1")){
        addNumber();
      } else if(input.equals("2")){
        searchNumber();
      } else if(input.equals("3")){
        searchPerson();
      } else if(input.equals("4")){
        addAddress();
      } else if(input.equals("5")){
        searchInfo();
      } else if(input.equals("6")){
        deleteInfo();
      } else if(input.equals("7")){
        filteredListing();
      } 

      System.out.println("");
      System.out.print("command: ");
      input = reader.nextLine();
    }
  }

  public void addNumber(){
    System.out.print("whose number: ");
    String name = reader.nextLine();
    System.out.print("number: ");
    String number = reader.nextLine();
    phonebook.addNumber(name, number);
  }

  public void searchNumber(){
    System.out.print("whose number: ");
    String name = reader.nextLine();
    phonebook.printNumbers(name);
  }

  public void searchPerson(){
    System.out.print("number: ");
    String number = reader.nextLine();
    System.out.println(" " + phonebook.personByNumber(number)); 
  }

  public void addAddress(){
    System.out.print("whose address: ");
    String name = reader.nextLine();
    System.out.print("street: ");
    String address = reader.nextLine();
    System.out.print("city: ");
    address += " " + reader.nextLine();
    phonebook.addAddress(name, address);
  }

  public void searchInfo(){
    System.out.print("whose information: ");
    String name = reader.nextLine();
    phonebook.getAllInfo(name);
  }

  public void deleteInfo(){
    System.out.print("whose information: ");
    String name = reader.nextLine();
    phonebook.deleteAll(name);
  }

  public void filteredListing(){
    System.out.print("keyword (if empty, all listed): ");
    String keyword = reader.nextLine();
    phonebook.searchByKeyword(keyword);
  }
}