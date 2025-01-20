import Exceptions.PayNotAcceptedException;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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



  public List<Double> getDenominations() {
    return denominationCounts.keySet().stream().sorted().toList();
  }

  public void PrintDenominations() {
    System.out.println(denominationCounts.keySet().stream().map(String::valueOf).collect(Collectors.joining(", ")));
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    denominationCounts.forEach((key, value) -> str.append("Value: ").append(key).append(", quantity: ").append(value).append("\n"));
    return str.toString();
  }

  // greedy first
  public HashMap<Double, Integer> returnChange(double totalCash) {
    HashMap<Double, Integer> changeCounts = new HashMap<>();

    List<Double> denominations = getDenominations().reversed();

// demonstracijai kad bandziau su streamais bet sprendimas nepanasu kad imanomas nes totalCash gali keistis
//    denominations.forEach( item -> {
//        while (true) {
//          if (totalCash - denomination >= 0) {
//            totalCash -= denomination;
//            changeCounts.putIfAbsent(denomination, 1);
//          } else {
//            break;
//          }
//        }
//
//    });

    for (Double denomination : denominations) {
      while (true) {
        if (totalCash - denomination >= 0) {
          totalCash -= denomination;
          changeCounts.merge(denomination, 1, Integer::sum);
        } else {
          break;
        }
      }
    }

    // cia reiktu throwint jeigu netycia neiseis grazinti sumos visos nes tarkim 0.01 lieka o mes neturim 1 cento
    if (totalCash > 0) {
      throw new PayNotAcceptedException("invalid currency value detected");
    }

    return changeCounts;
  }
}
