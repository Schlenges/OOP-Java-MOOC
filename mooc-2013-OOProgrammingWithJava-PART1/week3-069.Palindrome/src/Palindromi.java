import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text) {
        int i = 0;
        String reverse = "";
        while(i < text.length()){
            i++;
            reverse += text.charAt(text.length() - i);
        }
        return reverse;
    }

    public static boolean palindrome(String text) {
        // write code here
        /*
        if(text.equals(reverse(text))){
            return true;
        }
        return false;
        */
        boolean isPalindrome = text.equals(reverse(text));
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
