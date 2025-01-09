
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] a = {2, 1, 3, 5, 3, 2};
    int[] b = {2, 2};
    int[] c = {2, 4, 3, 5, 1};


    System.out.println(findDuplicate(a));
    System.out.println(findDuplicate(b));
    System.out.println(findDuplicate(c));
  }


  public static int findDuplicate(int[] arr) {
    Map<Integer, Integer> touched = new HashMap<Integer, Integer>();

    int firstDuplicate = -1;
    // Scan for duplicates
    for (int num : arr) {
      if (touched.containsKey(num)) {
        firstDuplicate = num;
        break;
      } else {
        touched.put(num, 1);
      }
    }

    return firstDuplicate;
  }
}