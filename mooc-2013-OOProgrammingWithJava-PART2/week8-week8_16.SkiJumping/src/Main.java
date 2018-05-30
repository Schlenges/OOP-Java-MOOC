import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Participants participants = new Participants();

        new UserInterface(reader, participants).start();
    }
}
