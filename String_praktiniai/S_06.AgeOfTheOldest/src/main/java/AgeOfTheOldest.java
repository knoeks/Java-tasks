
import java.util.Scanner;

public class AgeOfTheOldest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) break;

            String[] words = input.split(",");
            biggest = Math.max(biggest, Integer.parseInt(words[1]));
        }
        System.out.println("Age of the oldest: " + biggest);

    }
}
