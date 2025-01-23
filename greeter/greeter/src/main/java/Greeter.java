public class Greeter {
  private final GreeterLanguageStrategy greeterLanguageStrategy;
  private final GreeterPunctuationStrategy greeterPunctuationStrategy;

  public Greeter(GreeterLanguageStrategy greeterLanguageStrategy, GreeterPunctuationStrategy greeterPunctuationStrategy) {
    this.greeterLanguageStrategy = greeterLanguageStrategy;
    this.greeterPunctuationStrategy = greeterPunctuationStrategy;
  }

  public void greet(String firstName, String lastName) {
    System.out.println(greeterLanguageStrategy.getGreetingString() + firstName + " " + lastName + greeterPunctuationStrategy.getPunctuationString());
  }

}
