import java.math.BigDecimal;

public abstract class BaseProduct implements Product {
  private String name;
  private BigDecimal neto;
  private final BigDecimal tax = new BigDecimal(21);
  private BigDecimal bruto;

  public BaseProduct(String name) {
    this.name = name;
    this.neto = ParseDecimal.getPrice();
    bruto = BrutoCalculator.calculate(neto, tax);
  }

  public void setBasePrice() {
    this.neto = ParseDecimal.getPrice();
    bruto = BrutoCalculator.calculate(neto, tax);
  }

  public BigDecimal getBruto() {
    return bruto;
  }

  @Override
  public String toString() {
    return "basePrice: " + neto +
           "\ntax: " + tax;
  }
}
