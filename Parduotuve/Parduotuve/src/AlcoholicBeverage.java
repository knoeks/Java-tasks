import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AlcoholicBeverage extends BaseAlcohol {
  private static final BigDecimal tax = new BigDecimal("0.21");
  private BigDecimal alcoholBreakPoint = new BigDecimal("0.15");
  private ArrayList<BigDecimal> excises = new ArrayList<>(List.of(new BigDecimal("0.28"), new BigDecimal("1.26")));

  public AlcoholicBeverage() {
    super(tax);
  }

  public BigDecimal getBrutoForAlcohol() {
    return BrutoCalculator.calculate(getNeto(), tax);
  }

}
