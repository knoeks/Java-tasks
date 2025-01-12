import java.util.ArrayList;
import java.util.stream.Stream;

public class Hold {
  private int count = 0;
  private int weight = 0;
  private int capacity;
  private ArrayList<Suitcase> suitcases;

  public Hold(int capacity) {
    this.capacity = capacity;
    suitcases = new ArrayList<>();
  }

  public void addSuitcase(Suitcase suitcase) {
    if (weight + suitcase.totalWeight() > capacity) {
      return;
    }
    suitcases.add(suitcase);
    weight += suitcase.totalWeight();
    count++;
  }

  public String toString() {
    switch (count) {
      case 0:
        return count + " no suitcases";
      case 1:
        return count + " suitcase (" + weight + " kg)";
      default:
        return count + " suitcases (" + weight + " kg)";
    }
  }

  public void printItems() {
    suitcases.forEach(Suitcase::printItems);
  }

}
