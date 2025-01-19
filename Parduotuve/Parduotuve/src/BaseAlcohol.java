import java.math.BigDecimal;
import java.util.ArrayList;

public class BaseAlcohol extends BaseProduct {
  private final BigDecimal alcoholVolume;
  private Integer breakPoints;
  private ArrayList<BigDecimal> volumeBreakPoints;
  private ArrayList<BigDecimal> excises;

  // excises = volumeBreakPoint + 1;

  public BaseAlcohol(String name) {
    super(name);
    this.alcoholVolume = ParseInput.getValidatedInput("Input a valid alcohol percentage: ", ValidNumber::ValidateAlcoholVolume);
    this.breakPoints = 
    System.out.println(alcoholVolume);
  }


}
