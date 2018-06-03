package file;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Analysis{
  private File file;

  public Analysis(File file){
    this.file = file;
  }

  private String readFile() {
    try {
      String fileContent = "";
      Scanner reader = new Scanner(this.file);

      while (reader.hasNextLine()) {
        fileContent += reader.nextLine();
        fileContent += "\n";
      }

      return fileContent;
    } catch (FileNotFoundException e) {
        return "";
    }
}

  public int lines(){
    String[] lines = readFile().split("\n");
    return lines.length;
  }

  public int characters(){
    return readFile().length();
  }

}