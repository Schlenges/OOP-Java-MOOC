import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int i = 1;
        int factorial = 1;
        if(n > 0){
            while(i < n){
                i++;
                factorial *= i;
            }
        }
        System.out.println("Factorial is " + factorial);
    }
}
