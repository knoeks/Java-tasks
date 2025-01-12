import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
  private ArrayList<Item> items;
  private int capacity;

  public Suitcase(int capacity) {
    items = new ArrayList<>();
    this.capacity = capacity;
  }

  public void addItem(Item item) {
    if (totalWeight() + item.getWeight() > capacity) {
      return;
    }
    items.add(item);
  }

  public String toString() {
    switch (items.size()) {
      case 0:
        return "no items (0 kg)";
      case 1:
        return items.size() + " item (" + totalWeight() + " kg)";
      default:
        return items.size() + " items (" + totalWeight() + " kg)";
    }
  }

  public int totalWeight() {
    return items.stream().mapToInt(Item::getWeight).sum();
  }

  public void printItems() {
//    System.out.println("The suitcase contains the following items:");
    for (Item item : items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    return items.stream().max(Comparator.comparingInt(Item::getWeight)).orElse(null);
  }
}
