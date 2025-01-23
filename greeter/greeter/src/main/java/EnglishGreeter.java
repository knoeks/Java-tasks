public class EnglishGreeter implements GreeterLanguageStrategy {

  @Override
  public String getGreetingString() {
    return "Hello, ";
  }
}
