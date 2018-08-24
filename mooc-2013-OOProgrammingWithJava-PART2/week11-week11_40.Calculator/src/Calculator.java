
public class Calculator{

  private int value;

  public Calculator(){
    value = 0;
  }

  public void add(int n){
    value += n;
  }

  public void subtract(int n){
    value -= n;
  }

  public void reset(){
    value = 0;
  }

  public int getValue(){
    return value;
  }
}