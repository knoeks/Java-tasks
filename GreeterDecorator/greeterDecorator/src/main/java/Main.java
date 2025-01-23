public class Main {
  public static void main(String[] args) {

    Greeter first = new GreeterImpl();

    System.out.println(first.greet("Povilas", "May"));

    Greeter greetUpper = new GreeterUpperCaseDecorator(first);
    System.out.println(greetUpper.greet("Povilas", "May"));

    Greeter greetUpper1 = new GreeterUpperCaseDecorator(greetUpper);
    System.out.println(greetUpper1.greet("Povilas", "May"));

    Greeter greetExclamation = new GreeterExclamationDecorator(greetUpper1);
    System.out.println(greetExclamation.greet("Povilas", "May"));

    Greeter greetExclamation1 = new GreeterExclamationDecorator(greetExclamation);
    System.out.println(greetExclamation1.greet("Povilas", "May"));
  }
}
