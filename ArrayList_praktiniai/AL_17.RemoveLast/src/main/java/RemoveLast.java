
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        removeLast(cars);
        System.out.println(cars);

    }

    public static void removeLast(ArrayList<String> cars){
        cars.remove(cars.size() - 1);
    }

}
