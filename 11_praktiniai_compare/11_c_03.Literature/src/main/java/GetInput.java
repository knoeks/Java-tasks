import java.util.ArrayList;
import java.util.Scanner;

public class GetInput {

  public static Books getList() {
    Scanner scanner = new Scanner(System.in);
    Books books = new Books();
    while (true) {
      int recommendedAge;
      System.out.print("Input the name of the book, empty stops: ");
      String name = scanner.nextLine();
      if (name.isEmpty()) {
        break;
      }
      while (true) {
        System.out.print("Input the age recommendation: ");
        String recommendedAgeStr = scanner.nextLine();
        try {
          recommendedAge = Integer.parseInt(recommendedAgeStr);
          break;
        } catch (NumberFormatException e) {
          System.out.println("Must be a number");
        }
      }
      books.add(new Book(name, recommendedAge));
    }
    return books;
  }
}
