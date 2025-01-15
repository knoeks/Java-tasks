import java.util.HashMap;

public class Abbreviations {
  private final HashMap<String, String> dictionary;

  public Abbreviations() {
    dictionary = new HashMap<>();
  }

  public void addAbbreviation(String abbreviation, String explanation) {
    dictionary.put(abbreviation, explanation);
  }

  public boolean hasAbbreviation(String abbreviation) {
    return dictionary.containsKey(abbreviation);
  }

  public String findExplanationFor(String abbreviation) {
    return dictionary.get(abbreviation);
  }
}
