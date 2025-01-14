import java.math.BigDecimal;
import java.math.RoundingMode;

public class BrutoCalculator {
  public static BigDecimal calculate(BigDecimal neto, BigDecimal tax) {
    return neto.multiply(tax)
            .divide(new BigDecimal(100), RoundingMode.UP)
            .add(neto);
  }
}
