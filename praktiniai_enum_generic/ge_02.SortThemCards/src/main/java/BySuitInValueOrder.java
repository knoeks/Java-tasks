import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
  public int compare(Card o1, Card o2) {
    if((o1.getSuit().ordinal() - o2.getSuit().ordinal()) != 0) {
      return o1.getSuit().ordinal() - o2.getSuit().ordinal();
    } else {
      return o1.getValue() - o2.getValue();
    }
  }
}
