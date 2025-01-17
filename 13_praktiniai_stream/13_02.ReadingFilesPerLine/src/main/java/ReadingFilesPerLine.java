
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.io.File;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingFilesPerLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // test the method here
    System.out.println("file path: ");
    List<String> lines = read(scanner.nextLine());
    lines.stream().forEach(System.out::println);
  }

  public static List<String> read(String file) {
    List<String> books = new ArrayList<>();
    try {
//      File file1 = new File(file);
//      Scanner myReader = new Scanner(file1);
//      while (myReader.hasNextLine()) {
//        books.add(myReader.nextLine());
//      }

      books = Files.lines(Paths.get(file))
              .sorted().collect(Collectors.toList());
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return books;
  }

}
