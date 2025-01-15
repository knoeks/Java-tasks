
import java.util.HashMap;

public class Program {


  public static void main(String[] args) {
    // Test your program here!
    HashMap<String, String> hashmap = new HashMap<>();
    hashmap.put("f.e", "for example");
    hashmap.put("etc.", "and so on");
    hashmap.put("i.e", "more precisely");

    printKeys(hashmap);
    System.out.println("---");
    printKeysWhere(hashmap, "i");
    System.out.println("---");
    printValuesOfKeysWhere(hashmap, ".e");
  }

  public static void printKeys(HashMap<String, String> map) {
    map.keySet().stream().forEach(System.out::println);
  }

  public static void printKeysWhere(HashMap<String, String> map, String text) {
    map.keySet().stream().filter(item -> item.contains(text)).forEach(System.out::println);
  }

  public static void printValuesOfKeysWhere(HashMap<String, String> map, String text) {
    map.keySet().stream().filter(item -> item.contains(text)).forEach(item -> System.out.println(map.get(item)));
  }
}
