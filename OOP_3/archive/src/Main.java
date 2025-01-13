import archive.Archive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Archive> archives = new ArrayList<>();
    HashSet<String> uniqueID = new HashSet<>();

    while (true) {
      System.out.println("Identifier? (empty will stop)");
      String identifier = reader.nextLine();
      if (identifier.isEmpty()) {
        break;
      }
      System.out.println("Name? (empty will stop)");
      String name = reader.nextLine();
      if (name.isEmpty()) {
        break;
      }

      archives.add(new Archive(identifier, name));
    }

    System.out.println("==Items==");
    for (Archive archive : archives) {
      if (uniqueID.add(archive.getId())) {
        System.out.println(archive);
      }
    }
  }
}