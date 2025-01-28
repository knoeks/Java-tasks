package lt.techin.yes_man;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("yes?");

      switch (sc.nextLine()) {
        case "yes":
          System.out.println("good, good...");
          break;
        case "no":
          System.out.println("gay");
          return;
        default:
          System.out.println("Whats that?\n");
          break;
      }
    }
  }
}