import java.math.BigDecimal;
import java.math.RoundingMode;

public class Regular implements Product {
  private BigDecimal neto;
  private final BigDecimal tax = new BigDecimal(21);
  private BigDecimal bruto;


  public Regular() {
    this.neto = ParseDecimal.getInput();
    calculateTax();
  }

  public void setBasePrice() {
    this.neto = ParseDecimal.getInput();
    calculateTax();
  }

  private void calculateTax() {
    tax = neto.multiply(tax).divide(new BigDecimal(100), RoundingMode.UP);
  }

  public BigDecimal getBruto() {
    return bruto;
  }

  @Override
  public String toString() {
    return "basePrice: " + neto;
  }
}
