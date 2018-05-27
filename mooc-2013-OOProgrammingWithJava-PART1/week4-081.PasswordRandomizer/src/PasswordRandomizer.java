import java.util.Random;

public class PasswordRandomizer {
    // Define the variables 
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        
        while(password.length() < this.length){
            int num = random.nextInt(characters.length());
            char character = characters.charAt(num);
            password += character;
        }
        return password;
    }
}
