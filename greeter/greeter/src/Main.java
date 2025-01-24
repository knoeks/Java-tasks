public class Main {
  public static void main(String[] args) {
    Greeter greetLT = new LithuanianGreeter();
    greetLT.greet("Povilas", "Gegužis");

    Greeter greetEN = new EnglishGreeter();
    greetEN.greet("Povilas", "Gegužis");
  }
}