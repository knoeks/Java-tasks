package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
  private boolean poweredOn = false;
  private int number;

  public TemperatureSensor() {

  }

  @Override
  public boolean isOn() {
    return poweredOn;
  }

  @Override
  public void setOn() {
    this.poweredOn = true;
  }

  @Override
  public void setOff() {
    this.poweredOn = false;
  }

  @Override
  public int read() {
    if (!poweredOn) {
      throw new IllegalArgumentException();
    }
//    return (int) (Math.round(Math.random()*60) - 30);
    number = new Random().nextInt(61) - 30;
    return number;
  }
}
