import java.math.BigDecimal;
import java.util.ArrayList;

public class BaseAlcohol extends BaseProduct {
  private final BigDecimal alcoholVolume;

  // excises = volumeBreakPoint + 1;

  public BaseAlcohol(BigDecimal tax) {
    super(tax);
    this.alcoholVolume = ParseInput.getValidatedNumber("Input a valid alcohol percentage: ", ValidNumber::ValidateAlcoholVolume);
    ParseInput.getValidatedNumber("Enter price before tax: ", ValidNumber::ValidatePositiveDecimal);
  }

  public BigDecimal getAlcoholVolume() {
    return alcoholVolume;
  }
}
