package file;

import java.io.File;
import file.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("testfile.txt");
        Analysis analysis = new Analysis(file);
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Characters: " + analysis.characters());
    }
}