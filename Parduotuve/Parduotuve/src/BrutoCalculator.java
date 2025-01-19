import java.math.BigDecimal;
import java.math.RoundingMode;

public class BrutoCalculator {
  public static BigDecimal calculate(BigDecimal neto, BigDecimal tax) {
    return neto.multiply(tax)
            .add(neto).setScale(2, RoundingMode.UP);
  }
}
