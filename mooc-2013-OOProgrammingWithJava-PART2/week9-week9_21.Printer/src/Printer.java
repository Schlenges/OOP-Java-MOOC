import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Printer {
  private Scanner reader;
  private List<String> lines;

  public Printer(String fileName) throws Exception {
      this.reader = new Scanner(new File(fileName));
      this.lines = new ArrayList<String>();

      while(reader.hasNextLine()){
        lines.add(reader.nextLine());
      }
  }

  public void printLinesWhichContain(String word) throws Exception {
    for(String line : lines){
      if(line.contains(word)){
        System.out.println(line);
      }
    }


/*  this.reader = new Scanner(this.file);

    while (reader.hasNextLine()) {
      String line = reader.nextLine();

      if(line.contains(word)) {
        System.out.println(line);
      }
    }

    reader.close(); */
  }

}