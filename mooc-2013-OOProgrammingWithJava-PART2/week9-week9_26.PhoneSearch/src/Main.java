import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Scanner reader = new Scanner(System.in);

        new UserInterface(reader).start();
        /*
        1 adding a phone number to the relative person
        2 phone number search by person
        3 name search by phone number
        4 adding an address to the relative person
        5 personal information search (search for a person's address and phone number)
        6 removing a person's information
        7 filtered search by keyword (retrieving a list which must be sorted by name in alphabetic order), the keyword can appear in the name or address
        */
    }
}
