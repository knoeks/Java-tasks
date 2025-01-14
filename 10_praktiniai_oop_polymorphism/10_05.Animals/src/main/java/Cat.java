public class Cat extends Animal implements NoiseCapable {

  public Cat() {
    super("cat");
  }

  public Cat(String name) {
    super(name);
  }

  public void purr() {
    System.out.println(getName() + " purrs");
  }

  @Override
  public void makeNoise() {
    purr();
  }
}
