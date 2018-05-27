
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int b = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = a;
        while(i <= b){
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
