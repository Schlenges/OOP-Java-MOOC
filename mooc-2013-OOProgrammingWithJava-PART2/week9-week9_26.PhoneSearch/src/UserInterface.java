import java.util.Scanner;

public class UserInterface{
  private Scanner reader;

  public UserInterface(Scanner reader){
    this.reader = reader;
  }

  public void start(){
    PhoneBook phonebook = new PhoneBook();

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
      String name;
      String number;
      String address;

      switch(input) {
        case "1":
          System.out.print("whose number: ");
          name = reader.nextLine();
          System.out.print("number: ");
          number = reader.nextLine();
          phonebook.addNumber(name, number);
          break;
        case "2":
          System.out.print("whose number: ");
          name = reader.nextLine();
          phonebook.printNumbers(name);
          break;
        case "3":
          System.out.print("number: ");
          number = reader.nextLine();
          System.out.println(" " + phonebook.personByNumber(number)); 
          break;
        case "4":
          System.out.print("whose address: ");
          name = reader.nextLine();
          System.out.print("street: ");
          address = reader.nextLine();
          System.out.println("city: ");
          address += " " + reader.nextLine();
          phonebook.addAddress(name, address);
          break;
        case "5":
          System.out.println("whose information: ");
          name = reader.nextLine();
          phonebook.getAllInfo(name);
          break;
        case "6":
          System.out.println("whose information: ");
          name = reader.nextLine();
          phonebook.deleteAll(name);
          break;
        case "7":
          System.out.println("keyword (if empty, all listed): ");
          name = reader.nextLine();
          phonebook.searchByKeyword(name);
          break;
      }

      System.out.println("");
      System.out.print("command: ");
      input = reader.nextLine();
    }
  }
}