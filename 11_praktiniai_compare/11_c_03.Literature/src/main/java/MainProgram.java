
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

  public static void main(String[] args) {
    Books books = GetInput.getList();
    System.out.println(books);
    books.sortByAgeAndName();
    System.out.println(books);
    books.sortByAge();
    System.out.println(books);
  }

}
