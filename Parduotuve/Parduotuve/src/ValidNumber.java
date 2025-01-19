import java.math.BigDecimal;

// galvoju padaryti sita i interface kad butu galima skirtingus budus validation daryt
// taip labiau reusable kodas bus bet dabar susiduriu su problemomis kad as negaliu constructoriu iskelti
public class ValidNumber {
  private final BigDecimal value;


  // constructors - 1) when input = Number 2) when input = String
  public ValidNumber(Number value) {
    this.value = new BigDecimal(String.valueOf(value));
  }

  public ValidNumber(String value) {
    try {
      this.value = new BigDecimal(value);
    } catch (NumberFormatException e) {
      System.out.print("Invalid number format for string input: ");
      throw e; // Rethrow the exception after logging the error
    }
  }



  // validation methods that output of type BigDecimal/Integer depending on method called
  public BigDecimal ValidateAlcoholVolume() {
    if (value.compareTo(BigDecimal.ONE) > 0 && value.compareTo(new BigDecimal(80)) < 0) {
      return value;
    } else {
      throw new NumberFormatException("valid alcohol volume is between 1% - 80%");
    }
  }

  public BigDecimal ValidatePositiveDecimal() {
    if (value.compareTo(BigDecimal.ZERO) > 0) {
      return value;
    } else {
      throw new NumberFormatException("invalid decimal number.");
    }
  }

  public Integer ValidateNatural() {
    if (value.compareTo(BigDecimal.ZERO) > 0) {
      return value.intValue();
    } else {
      throw new NumberFormatException("invalid natural number.");
    }
  }
}
