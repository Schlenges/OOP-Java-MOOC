import java.util.*;
import java.io.*;

public class Printer {

  private File file;
  private Scanner reader;

  public Printer(String fileName) throws Exception {
      this.file = new File(fileName);
  }

  public void printLinesWhichContain(String word) throws Exception {
    this.reader = new Scanner(this.file);

    while (reader.hasNextLine()) {
      String line = reader.nextLine();

      if(line.contains(word)) {
        System.out.println(line);
      }
    }

    reader.close();
  }

}