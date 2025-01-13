import java.util.Scanner;

public class Reader {
  private final Scanner reader;

  public Reader() {
    reader = new Scanner(System.in);
  }

  public String readString() {
    return reader.nextLine();
  }

  public int readInteger() {
    int number;
    while (true) {
      try {
        return Integer.parseInt(reader.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Not a valid number. Please try again :");
      }
    }
  }
}
