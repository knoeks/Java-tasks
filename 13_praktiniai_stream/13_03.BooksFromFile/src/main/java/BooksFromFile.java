
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
import java.util.stream.StreamSupport;

public class BooksFromFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // test your method here
//    List<Book> books = readBooks(Path.of("/books.txt").toFile());
    List<Book> books = readBooks(scanner.nextLine());

    books.stream().forEach(System.out::println);
  }

  public static List<Book> readBooks(String file) {
    List<Book> books;
    try {
      books = Files.lines(Paths.get(file)).sorted().map(item -> {
        String[] parts = item.split(",");
        return new Book(
                parts[0].trim(),
                Integer.parseInt(parts[1]),
                Integer.parseInt(parts[2]),
                parts[3].trim()
        );
      }).toList();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return books;
  }
}
