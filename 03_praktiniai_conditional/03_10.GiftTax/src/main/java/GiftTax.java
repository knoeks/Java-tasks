
import java.util.Scanner;
import java.util.Locale;

public class GiftTax {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Value of the gift?");
    int num = Integer.parseInt(scan.nextLine());

    if (0 > num) {
      System.out.println("value cannot be negative");
    } else if (5000 > num) {
      System.out.println("No Tax!");
    } else if (25000 > num) {
      System.out.printf(Locale.US, "Tax: %.1f", 100 + ((num - 5000) * 0.08));
    } else if (55000 > num) {
      System.out.printf(Locale.US, "Tax: %.1f", 1700 + ((num - 25000) * 0.1));
    } else if (200000 > num) {
      System.out.printf(Locale.US, "Tax: %.1f", 4700 + ((num - 55000) * 0.12));
    } else if (1000000 > num) {
      System.out.printf(Locale.US, "Tax: %.1f", 22100 + ((num - 200000) * 0.15));
    } else {
      System.out.printf(Locale.US, "Tax: %.1f", 142100 + ((num - 1000000) * 0.17));
    }
  }
}
