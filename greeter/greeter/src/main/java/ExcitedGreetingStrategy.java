public class ExcitedGreetingStrategy implements GreeterPunctuationStrategy{
  @Override
  public String getPunctuationString() {
    return "!!!";
  }
}
