import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ParseDecimal {
  private final static Scanner reader = new Scanner(System.in);

  public static BigDecimal getInput() {
    while (true) {
      try {
        System.out.println("Enter a valid decimal number: ");
        BigDecimal a = new BigDecimal(reader.nextLine());
        return a.setScale(2, RoundingMode.UP);
      } catch (NumberFormatException e) {
        System.out.println("\nInvalid input. Please enter a valid decimal number");
      }
    }
  }

  public static BigDecimal getVolume() {
    while (true) {
      try {
        System.out.println("Enter a valid decimal number: ");
        BigDecimal a = new BigDecimal(reader.nextLine());
        return a.setScale(2, RoundingMode.UP);
      } catch (NumberFormatException e) {
        System.out.println("\nInvalid input. Please enter a valid decimal number");
      }
    }
  }
}
