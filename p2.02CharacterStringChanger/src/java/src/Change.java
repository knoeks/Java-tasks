public class Change {
  private char fromCharacter;
  private char toCharacter;

  public Change(char fromCharacter, char toCharacter) {
    this.fromCharacter = fromCharacter;
    this.toCharacter = toCharacter;
  }

  public String change(String word) {
//    int index = -1;
//    StringBuilder change = new StringBuilder(word);
//    do {
//      index = word.indexOf(fromCharacter, index + 1);
//      if (index != -1) {
//        change.replace(index, index + 1, String.valueOf(toCharacter));
//      }
//    }
//    while (index != -1);
//    return change.toString();
    return word.replace(fromCharacter, toCharacter);

  }
}