package multiplier;

public class Multiplier {
  private int a;
  private int b;

  public Multiplier(int a) {
    this.a = a;
  }

  public int multiply(int b) {
    this.b = b;
    return a * this.b;
  }
}
