import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import books.Books;

public class Main {
  public static void main(String[] args) {
    ArrayList<Books> bookList = new ArrayList<>();
    Scanner read = new Scanner(System.in);
    int count = 0;

    while (true) {
      System.out.println("Name (empty will stop):");
      String name = read.nextLine();
      if (name.isEmpty()) {
        System.out.println("Thank you! Books added: " + count);
        break;
      }

      System.out.println("Publication year:");
      String yearStr = read.nextLine();
      int year;

      try {
        year = Integer.parseInt(yearStr);
      } catch (NumberFormatException err) {
        System.out.println("input must be number");
        return;
      }

      Books newBook = new Books(name, year);

      if (bookList.contains(newBook)) {
        System.out.println("The book is already on the list. Let's not add the same book again.");
      } else {
        count++;
        bookList.add(newBook);
      }
    }
  }
}