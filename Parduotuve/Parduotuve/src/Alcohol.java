import java.math.BigDecimal;

public class Alcohol {
  private BigDecimal alcoholVolume;

  public Alcohol() {
    this.alcoholVolume = ParseDecimal.getVolume();
    System.out.println(alcoholVolume);
  }


}
