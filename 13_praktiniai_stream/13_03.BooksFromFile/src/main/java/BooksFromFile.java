
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // test your method here
//    List<Book> books = readBooks(Path.of("/books.txt").toFile());
    List<Book> books = readBooks(scanner.nextLine());

    books.stream().forEach(System.out::println);
  }

  public static List<Book> readBooks(String file) {
    List<Book> books = new ArrayList<>();
    try {
      File file1 = new File(file);
      Scanner reader = new Scanner(file1);
      while (reader.hasNextLine()) {
        List<String> book = Arrays.stream(reader.nextLine().split(",")).toList();
        books.add(new Book(book.get(0), Integer.parseInt(book.get(1)), Integer.parseInt(book.get(2)), book.get(3)));
      }

    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
    return books;
  }
}
