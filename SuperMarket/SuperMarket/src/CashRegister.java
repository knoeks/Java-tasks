import Exceptions.OutOfChangeException;
import Exceptions.PayNotAcceptedException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CashRegister {
  private final TreeMap<BigDecimal, Integer> denominationCounts;

  public CashRegister() {
    denominationCounts = new TreeMap<>(Comparator.reverseOrder());
  }


  public void add(double denomination, int count) {
    if (denomination <= 0 && count <= 0) {
      return;
    }
    denominationCounts.put(new BigDecimal(denomination).setScale(2, RoundingMode.HALF_UP), count);
  }

  public void add(TreeMap<BigDecimal, Integer> map) {
    denominationCounts.putAll(map);
  }

  public List<BigDecimal> getDescDenominations() {
    return denominationCounts.keySet().stream().toList();
  }

  public boolean coinExists(String input) {
    if (input.matches("^([1-9]\\d*(\\.)\\d*|0?(\\.)\\d*[1-9]\\d*|[1-9]\\d*)$") && getDescDenominations().contains(new BigDecimal(input).setScale(2, RoundingMode.HALF_UP))) {
      return true;
    }
    throw new PayNotAcceptedException("unknown currency");
  }

  public String PrintAscDenominations() {
    return denominationCounts.keySet().stream().sorted().map(String::valueOf).collect(Collectors.joining(", "));
  }

  public void getChange(List<Double> coins, Double price) {
    BigDecimal totalChange = new BigDecimal(coins.stream().mapToDouble(Double::doubleValue).sum() - price).setScale(2, RoundingMode.HALF_UP);
    TreeMap<BigDecimal, Integer> change = new TreeMap<>();


    //sitas sugeneruoja graza
    for (BigDecimal denomination : getDescDenominations()) {
      while (denomination.compareTo(totalChange) <= 0) {
        totalChange = totalChange.subtract(denomination);
        if (denominationCounts.get(denomination) - 1 < 0) {
          break;
        }
        change.merge(denomination.setScale(2, RoundingMode.HALF_UP), 1, Integer::sum);
      }
    }

    // jeigu cia dar lieka grazos tada vadinasi nebeliko kaip grazinti pinigu
    if (totalChange.compareTo(BigDecimal.ZERO) > 0) {
      throw new OutOfChangeException("Out of Change.");
    }
    coins.forEach(coin -> denominationCounts.merge(new BigDecimal(coin).setScale(2, RoundingMode.HALF_UP), 1, Integer::sum));
    denominationCounts.forEach((key, value) ->
            denominationCounts.put(key, value - change.getOrDefault(key, 0)));
    PrintMap(change);
  }

  public void PrintMap(TreeMap<BigDecimal, Integer> map) {
    StringBuilder str = new StringBuilder();
    map.forEach((key, value) -> str.append("Value: ").append(key).append(", quantity: ").append(value).append("\n"));
    System.out.println(str.toString());
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    denominationCounts.forEach((key, value) -> str.append("Value: ").append(key).append(", quantity: ").append(value).append("\n"));
    return str.toString();
  }
}
