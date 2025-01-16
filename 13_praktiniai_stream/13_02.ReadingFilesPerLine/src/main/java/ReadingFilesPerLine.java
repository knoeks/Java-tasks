
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.File;
import java.io.FileWriter;

public class ReadingFilesPerLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // test the method here
    List<String> lines = read("text.txt");
    lines.stream().forEach(System.out::println);

    String data = "kekkonen\nwith two rows\n";
    File newFile = create(data);
  }

  public static List<String> read(String file) {
    List<String> books = new ArrayList<>();
    try {
      File file1 = new File(file);
      Scanner myReader = new Scanner(file1);
      while (myReader.hasNextLine()) {
        books.add(myReader.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return books;
  }

}
