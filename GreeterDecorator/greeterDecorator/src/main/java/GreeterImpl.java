public class GreeterImpl implements Greeter{


  @Override
  public String greet(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}
