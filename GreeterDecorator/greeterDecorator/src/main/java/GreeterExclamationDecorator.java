public class GreeterExclamationDecorator implements Greeter{
  Greeter greeter;

  public GreeterExclamationDecorator(Greeter greeter) {
    this.greeter = greeter;
  }

  @Override
  public String greet(String firstName, String lastName) {
    return greeter.greet(firstName, lastName) + "!";
  }
}
