
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
            System.out.println("Please enter a floating point number: ");
            double value = Double.parseDouble(reader.nextLine());
            if((value > -30) && (value < 40)){
                Graph.addNumber(value);
            }
        }
    }
}
