package dungeon;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;

public class Map{
  Random random = new Random();
  private int height;
  private int length;
  private int[] player = {0, 0};
  private HashMap<String, int[]> vampires;


  public Map(int height, int length, int vampires){
    this.height = height;
    this.length = length;
    this.vampires = new HashMap<String, int[]>();
  }


  public void print(){
    int rowCount = 0;
    int lineCount = 0;

    while(rowCount < height){
      String line = "";
      lineCount = 0;

      ArrayList<Integer> v = getCoordinates(rowCount);

      while(lineCount < length){
        if(rowCount == player[])
        if(v.contains(lineCount)){
          line += "V";
        } else{
          line += ".";
        }
        lineCount++;
      }

      System.out.println(line);
      rowCount++;
    }
  }


  public void createVampires(int amount){
    int count = 1;

    while(count <= amount){
      String name = "vampire" + count;

      int[] coordinates = {random.nextInt(length), random.nextInt(height)};

      this.vampires.put(name, coordinates);
      count++;
    }
  }


  public int[] move(int[] position, int steps){
    int[] range = range(position[0], steps);
    int min = range[0];
    int max = range[1];

    int newX = random.nextInt((max - min) + 1) + min;

    int distance = Math.abs(position[0] - newX);

    int remainingSteps = steps - distance;

    range = range(position[1], remainingSteps);

    min = range[0];
    max = range[1];

    int newY = random.nextInt((max - min) + 1) + min;

    int[] newPosition = {newX, newY};

    return newPosition;
  }


  private int[] range(int position, int steps){
    int min = position - steps;
    int max = position + steps;

    if(min < 0){
      min = 0;
    }

    if(max > length - 1){
      max = length - 1;
    }

    int[] range = {min, max};
    return range;
  }


  public void moveVamps(int steps){
    HashMap<String, int[]> movedVamps = new HashMap<String, int[]>();

    for(String vampire : vampires.keySet()){
      int[] newPosition = move(vampires.get(vampire), steps);

      if(!(movedVamps.containsValue(newPosition))){
        movedVamps.put(vampire, newPosition);
      } else{
        movedVamps.put(vampire, vampires.get(vampire));
      }
      
    }

    vampires = movedVamps;
  }


  private ArrayList<Integer> getCoordinates(int rowCount){
    ArrayList<Integer> v = new ArrayList<Integer>();

    for(String vampire : vampires.keySet()){
      if(rowCount == vampires.get(vampire)[1]){
        v.add(vampires.get(vampire)[0]);
      }
    }

    Collections.sort(v);
    return v;
  }


  public void printVampPositions(){
    for(String name : vampires.keySet()){
      System.out.println(Arrays.toString(vampires.get(name)));
    }
  }

}