package application;

import java.util.Random;

public class Thermometer implements Sensor{
  private boolean on;

  public Thermometer(){
    this.on = false;
  }

  @Override
  public boolean isOn(){
    return on;
  }

  @Override
  public void on(){
    on = true;
  }

  @Override
  public void off(){
    on = false;
  }

  @Override
  public int measure(){
    if(!on){
      throw new IllegalStateException("The thermometer is off.");
    }

    return new Random().nextInt(30 + 30 + 1) - 30;
  }
}