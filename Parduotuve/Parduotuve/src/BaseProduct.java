import java.math.BigDecimal;

public abstract class BaseProduct {
  private String name;
  private BigDecimal neto;
  private BigDecimal tax = new BigDecimal(21);

  public BaseProduct(String name) {
    this.name = name;
    this.neto = ParseInput.getValidatedInput("Enter price before tax: ", ValidNumber::ValidatePositiveDecimal);
    this.tax = tax;
  }

 // setters
  public void setNeto() {
    this.neto = ParseInput.getValidatedInput("Change price before tax: ", ValidNumber::ValidatePositiveDecimal);
  }

  public void setName(String name) {
    this.name = name;
  }

  // getters
  public String getName() {
    return name;
  }

  public BigDecimal getNeto() {
    return neto;
  }

  public BigDecimal getTax() {
    return tax;
  }

  public BigDecimal getBruto() {
    return BrutoCalculator.calculate(neto, tax);
  }


  // toString
  @Override
  public String toString() {
    return "basePrice: " + neto +
           "\ntax: " + tax;
  }
}
