
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        numbers.add(0);

        printNumbersInRange(numbers, 0, 5);


    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int start, int end) {
        // Try your method here
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= start && numbers.get(i) <= end) {
                System.out.println(numbers.get(i));
            }
        }


    }
    
}
