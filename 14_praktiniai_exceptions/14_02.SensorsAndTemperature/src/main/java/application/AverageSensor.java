package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
  private ArrayList<Sensor> sensors;
  private ArrayList<Integer> averageTemperatures;

  public AverageSensor() {
    sensors = new ArrayList<>();
    averageTemperatures = new ArrayList<>();
  }

  @Override
  public boolean isOn() {
    return !sensors.stream().anyMatch(item -> !item.isOn());
  }

  public void addSensor(Sensor sensor) {
    sensors.add(sensor);
  }

  @Override
  public void setOn() {
    sensors.forEach(Sensor::setOn);
  }

  @Override
  public void setOff() {
    sensors.stream().filter(Sensor::isOn).findAny().orElseThrow(() -> new IllegalArgumentException("no active sensors")).setOff();
  }

  @Override
  public int read() {
    if (!isOn()) {
      throw new IllegalArgumentException();
    }
    int reading = (int) sensors.stream().mapToInt(Sensor::read).average().orElse(0);
    averageTemperatures.add(reading);
    return reading;
  }

  public List<Integer> readings() {
    return averageTemperatures;
  }
}
