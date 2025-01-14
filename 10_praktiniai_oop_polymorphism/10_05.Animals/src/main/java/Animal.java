public abstract class Animal {
  private final String name;

  public Animal(String name) {
    this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
  }

  public void eat() {
    System.out.println(name + " eats");
  }

  public void sleep() {
    System.out.println(name + " sleeps");
  }

  public String getName() {
    return name;
  }
}
