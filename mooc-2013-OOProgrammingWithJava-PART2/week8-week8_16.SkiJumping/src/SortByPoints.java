import java.util.Comparator;

public class SortByPoints implements Comparator<Jumper>{
  public int compare(Jumper jumper1, Jumper jumper2){
    return jumper2.getTotalScore() - jumper1.getTotalScore();
  }
}