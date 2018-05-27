import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        /* ArrayList<Integer> scores = new ArrayList<Integer>(); */
        GradeDistribution distribution = new GradeDistribution();
        
        
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) {
                break;
            }
 
            distribution.addAScore(score);
        }
        
        distribution.print();
    }
    
    /*
    public static void distribution(ArrayList<Integer> scores){

        String zero = "",
               one = "",
               two = "",
               three = "",
               four = "",
               five = "";
        
        System.out.println("Grade distribution:");
        
        for(int score : scores){
            if (score < 30) {
                zero += "*";
            } else if (score < 35) {
                one += "*";
            } else if (score < 40) {
                two += "*";
            } else if (score < 45) {
                three += "*";
            } else if (score < 50) {
                four += "*";
            } else {
                five += "*";
            }
        }
        
        System.out.println("5: " + five);
        System.out.println("4: " + four);
        System.out.println("3: " + three);
        System.out.println("2: " + two);
        System.out.println("1: " + one);
        System.out.println("0: " + zero);
        
        int accepted = scores.size() - zero.length();
        double percentage = 0;
        
        if(scores.size() > 0){
            percentage = 100 * accepted / scores.size();
        }
        
        System.out.println("Acceptance percentage: " + percentage);
    }
*/
}