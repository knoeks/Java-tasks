
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        while (true) {
            int biggest = 0;
            String input = scanner.nextLine();
            if (input.isEmpty()) break;

            String[] words = input.split(",");
            if (biggest < Integer.parseInt(words[1])) {
                biggest = Integer.parseInt(words[1]);
                name = words[0];
            }
        }
        System.out.println("Name of the oldest: " + name);


    }
}
