package application;

public class ConstantSensor implements Sensor{
  private int measure;

  public ConstantSensor(int measure){
    this.measure = measure;
  }

  @Override
  public int measure(){
    return measure;
  }

  @Override
  public boolean isOn(){
    return true;
  }

  @Override
  public void on(){
    return;
  }

  @Override
  public void off(){
    return;
  }
}