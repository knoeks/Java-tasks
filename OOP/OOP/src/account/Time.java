package account;

public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  public void setSecond(int second) {
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  public Time nextSecond() {
    second++;
    if (second > 59) {
      minute++;
      second %= 60;
    }
    if (minute > 59) {
      hour++;
      minute %= 60;
    }
    if (hour > 23) {
      hour %= 24;
    }
    return this;
  }

  public Time previousSecond() {
    second--;
    if (second < 0) {
      minute--;
      second += 60;
    }
    if (minute < 0) {
      hour--;
      minute += 60;
    }
    if (hour < 0) {
      hour += 24;
    }

    return this;
  }
}
