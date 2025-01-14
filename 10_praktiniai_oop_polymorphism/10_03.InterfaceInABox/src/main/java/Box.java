import java.util.ArrayList;

public class Box implements Packable {
  private final double capacity;
  private final ArrayList<Packable> items;

  public Box(double capacity) {
    this.capacity = capacity;
    this.items = new ArrayList<>();
  }

  public void add(Packable packable) {
    if (weight() + packable.weight() > capacity) {
      return;
    }
    items.add(packable);
  }

  @Override
  public double weight() {
    return items.stream().mapToDouble(Packable::weight).sum();
  }

  @Override
  public String toString() {
    StringBuilder box = new StringBuilder("Box: ");
    box.append(items.size())
            .append(" items, total weight ")
            .append(weight()).append(" kg");

    return box.toString();
  }
}
