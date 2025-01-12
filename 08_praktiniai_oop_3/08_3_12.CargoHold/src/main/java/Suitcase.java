import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
  private ArrayList<Item> items;
  private int count = 0;
  private int weight = 0;
  private int capacity;

  public Suitcase(int capacity) {
    items = new ArrayList<>();
    this.capacity = capacity;
  }

  public void addItem(Item item) {
    if (weight + item.getWeight() > capacity) {
      return;
    }
    count++;
    weight += item.getWeight();
    items.add(item);
  }

  public String toString() {
    switch (count) {
      case 0:
        return count + " no items";
      case 1:
        return count + " item (" + weight + " kg)";
      default:
        return count + " items (" + weight + " kg)";
    }
  }

  public int totalWeight() {
    return weight;
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
