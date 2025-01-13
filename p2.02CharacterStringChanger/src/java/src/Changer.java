import java.util.ArrayList;

public class Changer {
  private final ArrayList<Change> changes;

  public Changer() {
    changes = new ArrayList<>();
  }

  public void addChange(Change change) {
    changes.add(change);
  }

  public String change(String word) {
    for (Change replace : changes) {
      word = replace.change(word);
    }
    return word;
  }
}
