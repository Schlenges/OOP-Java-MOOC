
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("testinput1.txt")) {
            System.out.println(line);
        }

        t.save("test.txt", "Why hello there!");

        t.save("test2.txt", t.read("testinput2.txt"));

    }
}
