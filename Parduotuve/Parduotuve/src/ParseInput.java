import java.util.Scanner;
import java.util.function.Function;

public class ParseInput {
  private final static Scanner reader = new Scanner(System.in);


  // useage:
  // BigDecimal price = getValidatedInput("Enter a valid decimal number for price: ", ValidNumber::ValidateAlcoholVolume);
  public static <T> T getValidatedInput(String prompt, Function<ValidNumber, T> validationFunction) {
    while (true) {
      try {
        // naudojamas funkcinis interfeisas. Paduodama klase su reikiamu metodu
        // pavyzdziai
        // 1)ValidNumber::ValidateNatural
        // 2)ValidNumber::ValidateAlcoholVolume
        System.out.println(prompt);
        ValidNumber number = new ValidNumber(reader.nextLine());
        return validationFunction.apply(number);
      } catch (NumberFormatException e) {
        System.out.println("Please try again.\n");
      }
    }
  }













  // palieku sitas funkcijas kaip fallback jeigu nepavyks susitvarkyt su funkciniu interfeisu

//  public static BigDecimal getPrice() {
//    while (true) {
//      try {
//        System.out.println("Enter a valid decimal number: ");
//        ValidNumber number = new ValidNumber(reader.nextLine());
//        return number.ValidateAlcoholVolume();
//      } catch (NumberFormatException e) {
//        System.out.println("\nInvalid input. Please enter a valid decimal number");
//      }
//    }
//  }
//
//  public static BigDecimal getVolume() {
//    while (true) {
//      try {
//        System.out.println("Enter a valid decimal number: ");
//        ValidNumber number = new ValidNumber(reader.nextLine());
//        return number.ValidateAlcoholVolume();
//      } catch (NumberFormatException e) {
//        System.out.println("Input a number\n");
//      }
//    }
//  }
//
//  public static Integer getExciseCount() {
//    while (true) {
//      try {
//        System.out.println("Enter a valid natural number: ");
//        ValidNumber number = new ValidNumber(reader.nextLine());
//        return number.ValidateNatural();
//      } catch (NumberFormatException e) {
//        System.out.println("Input a number\n");
//      }
//    }
//  }
}
