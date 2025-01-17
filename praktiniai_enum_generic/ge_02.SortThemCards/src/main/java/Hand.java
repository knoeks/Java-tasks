import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand> {
  private List<Card> cards;

  public Hand() {
    cards = new ArrayList<>();
  }

  public void add(Card card) {
    cards.add(card);
  }

  public void sort() {
    cards.sort((Card::compareTo));
  }

  public void print() {
    cards.forEach(System.out::println);
  }

  @Override
  public int compareTo(Hand o) {
    return
            this.cards.stream().mapToInt(Card::getValue).sum() -
                    o.cards.stream().mapToInt(Card::getValue).sum();
  }

  public void sortBySuit() {
    cards.sort(new BySuitInValueOrder());
  }
}
