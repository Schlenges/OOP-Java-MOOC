/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author meike
 */
public class Participants{
    private List<Jumper> participants;
    
    public Participants(){
        this.participants = new ArrayList<Jumper>();
    }
    
    public void add(Jumper jumper){
        participants.add(jumper);
    }

    public Jumper getJumper(int i){
      return participants.get(i);
    }

    public int numberParticipants(){
      return participants.size();
    }
    
    public void print(){
        for(Jumper jumper : participants){
            System.out.println(jumper);
        }
    }

    public void sort(){
      Collections.sort(participants);
    }

    public void sortByPoints(){
      SortByPoints sorter = new SortByPoints();
      Collections.sort(participants, sorter);
    }

    public void jump(){
      for(Jumper jumper : participants){
        jumper.setScore();
        jumper.addJump();
      }
    }

}
