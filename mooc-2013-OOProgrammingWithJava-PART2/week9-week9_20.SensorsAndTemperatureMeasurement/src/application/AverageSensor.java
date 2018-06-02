package application;

import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
  private List<Sensor> sensors;
  private List<Integer> readings;

  public AverageSensor(){
    this.sensors = new ArrayList<Sensor>();
    this.readings = new ArrayList<Integer>();
  }

  public void addSensor(Sensor additional){
    sensors.add(additional);
  }

  public List<Integer> readings(){
    return readings;
  }

  @Override
  public boolean isOn(){
    for(Sensor sensor : sensors){
      if(!sensor.isOn()){
        return false;
      }
    }

    return true;
  }

  @Override
  public void on(){
    for(Sensor sensor : sensors){
      sensor.on();
    }
  }

  @Override
  public void off(){
    for(Sensor sensor : sensors){
      sensor.off();
    }
  }

  @Override
  public int measure(){
    if(!isOn() || sensors.isEmpty()){
      throw new IllegalStateException("The sensor is off or empty.");
    }
    
    int sumMeasures = 0;
    for(Sensor sensor : sensors){
      sumMeasures += sensor.measure();
    }

    int average = sumMeasures / sensors.size();

    readings.add(average);

    return average;
  }
}