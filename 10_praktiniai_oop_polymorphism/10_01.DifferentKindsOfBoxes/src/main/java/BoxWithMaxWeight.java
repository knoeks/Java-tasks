import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
  private int capacity;
  private ArrayList<Item> items;

  public BoxWithMaxWeight(int capacity) {
    this.capacity = capacity;
    items = new ArrayList<>();
  }

  @Override
  public void add(Item item) {
    if (items.stream().mapToInt(Item::getWeight).sum() + item.getWeight() > capacity){
      return;
    }
    items.add(item);
  }

  @Override
  public boolean isInBox(Item item) {
    return items.contains(item);
  }


}
