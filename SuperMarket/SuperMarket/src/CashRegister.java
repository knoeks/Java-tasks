import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CashRegister {
  private final HashMap<Double, Integer> denominationCounts;

  public CashRegister() {
    denominationCounts = new HashMap<>();
  }

  public void add(double denomination, int count) {
    try {
      if (denomination <= 0 && count <= 0) {
        throw new IllegalArgumentException();
      }
      denominationCounts.put(denomination, count);
    } catch (IllegalArgumentException e) {
      System.out.println("cant be negative");
    }
  }

  public Set<Double> getDenominations() {
    return denominationCounts.keySet();
  }

  public HashMap<Double, Integer> returnChange(double totalCash) {
    HashMap<Double, Integer> changeCounts = new HashMap<>();

    List<Double> denominations = getDenominations().stream().sorted(Comparator.reverseOrder()).toList();
    for (Double denomination : denominations) {
      while (true) {
        if (totalCash - denomination >= 0) {
          totalCash -= denomination;
          changeCounts.putIfAbsent(denomination, 1);
        } else {
          break;
        }
      }

    }

    return changeCounts
  }
}
