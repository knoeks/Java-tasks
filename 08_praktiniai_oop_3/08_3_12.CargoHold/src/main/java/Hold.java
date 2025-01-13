import java.util.ArrayList;
import java.util.stream.Stream;

public class Hold {
  private int capacity;
  private ArrayList<Suitcase> suitcases;

  public Hold(int capacity) {
    this.capacity = capacity;
    suitcases = new ArrayList<>();
  }

  public void addSuitcase(Suitcase suitcase) {
    if (totalWeight() + suitcase.totalWeight() > capacity) {
      return;
    }
    suitcases.add(suitcase);
  }

  public int totalWeight() {
    return suitcases.stream().mapToInt(Suitcase::totalWeight).sum();
  }

  public String toString() {
    switch (suitcases.size()) {
      case 0:
        return suitcases.size() + " no suitcases";
      case 1:
        return suitcases.size() + " suitcase (" + totalWeight() + " kg)";
      default:
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
  }

  public void printItems() {
    suitcases.forEach(Suitcase::printItems);
  }

}
