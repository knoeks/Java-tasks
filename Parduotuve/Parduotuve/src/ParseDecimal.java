import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class ParseDecimal {
  private final static Scanner reader = new Scanner(System.in);

  public static BigDecimal getPrice() {
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
//      try {
      System.out.println("Enter a valid decimal number: ");

      // neveikiantis metodas, procentus reikia tikrinti su 
      DecimalFormat decimalFormat = new DecimalFormat("00.00");
      System.out.println(decimalFormat.format(new BigDecimal(reader.nextLine())));

      BigDecimal number = new BigDecimal("0.05");
      return number.setScale(2, RoundingMode.UP);
//      }
//      catch (ParseException e) {
//        System.out.println("\nInvalid input. Please enter a valid decimal number");
//
//      }
    }
  }
}
