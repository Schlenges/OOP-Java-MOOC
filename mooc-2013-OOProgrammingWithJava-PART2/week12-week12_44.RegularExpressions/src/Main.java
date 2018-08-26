import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a string: ");
        String string = reader.nextLine();
        if(clockTime(string)){
            System.out.println("The form is right.");
        } else{
            System.out.println("The form is wrong.");
        }
    }

    public static boolean isAWeekDay(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string){
        return string.matches("[aeiouäöü]*");
    }

    public static boolean clockTime(String string){
/*      String[] numbers = string.split(":");
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        
        try{
            hours = Integer.parseInt(numbers[0]);
            minutes = Integer.parseInt(numbers[1]);
            seconds = Integer.parseInt(numbers[2]);
        } catch(NumberFormatException e){}

        if(hours >= 0 && hours < 24){
            if(minutes >= 0 && minutes < 60){
                if(seconds >= 0 && seconds < 60){
                    return string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}");
                }
            }
        }
        return false; */

        return string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
