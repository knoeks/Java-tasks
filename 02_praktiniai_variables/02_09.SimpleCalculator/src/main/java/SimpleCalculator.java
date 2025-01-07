
import java.util.Scanner;
import java.util.Locale;


public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Give the first number: ");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d + %d = %d\n", first, second, first + second);
        System.out.printf("%d - %d = %d\n", first, second, first - second);

        System.out.printf("%d * %d = %d\n", first, second, first * second);
        System.out.printf(Locale.US, "%d / %d = %.1f\n", first, second, (double) first / second);

    }
}


