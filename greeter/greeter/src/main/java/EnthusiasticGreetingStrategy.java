public class EnthusiasticGreetingStrategy implements GreeterPunctuationStrategy{

  @Override
  public String getPunctuationString() {
    return "!";
  }
}
