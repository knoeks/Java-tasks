
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int count = 0;
        int sum = 0;

        while (true) {
            int biggest = 0;
            String input = scanner.nextLine();
            if (input.isEmpty()) break;

            String[] words = input.split(",");
            if (longestName.length() < words[0].length()) {
                longestName = words[0];
            }
            count++;
            sum += Integer.parseInt(words[1]);

        }
        System.out.println("Longest name: " + longestName);
        System.out.printf("Average of the birth years: %.1f", (double)sum/count);

    }
}
