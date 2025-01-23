public class Main {
  public static void main(String[] args) {
    GreeterLanguageStrategy firstStrategy = new LithuanianGreeter();
    GreeterLanguageStrategy secondStrategy = new EnglishGreeter();

    GreeterPunctuationStrategy enthusiasticStrategy = new EnthusiasticGreetingStrategy();
    GreeterPunctuationStrategy excitedStrategy = new ExcitedGreetingStrategy();


    Greeter greetLT = new Greeter(firstStrategy, enthusiasticStrategy);
    greetLT.greet("Povilai", "Geguži");

    Greeter greetEN = new Greeter(secondStrategy, excitedStrategy);
    greetEN.greet("Povilas", "Gegužis");

  }
}
