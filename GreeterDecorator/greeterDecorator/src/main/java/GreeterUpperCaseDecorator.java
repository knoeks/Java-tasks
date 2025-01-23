public class GreeterUpperCaseDecorator implements Greeter{
  Greeter greeter;

  public GreeterUpperCaseDecorator(Greeter greeter) {
    this.greeter = greeter;
  }

  @Override
  public String greet(String firstName, String lastName) {
    return greeter.greet(firstName, lastName).toUpperCase();
  }
}
