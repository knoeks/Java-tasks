
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> map){
        map.values().forEach(System.out::println);
    }

    public static void printValueIfNameContains(HashMap<String, Book> map, String text){
        map.values().stream().filter(book -> book.getName().contains(text)).forEach(System.out::println);
//        map.values().forEach(item -> System.out.println(map.get(item).getName().contains(text)));
    }
}
