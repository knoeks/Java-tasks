import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println(ElementUtils.lastElement(new ArrayList<>(List.of("one", "two", "three"))));
    System.out.println(ElementUtils.lastArrayElement(new Integer[]{7, 5, 3, 4})); // su primityvais neimanoma dirbti su generics
    System.out.println(ElementUtils.lastArrayElement(new String[]{"7", "5", "3", "4"}));

    try {
      Box<String> box1 = new Box<String>("John", "Martin");
      Box<String> box2 = new Box<String>("John", "Martin");

      Box<Integer> box3 = new Box<Integer>(1, 2);
      Box<Integer> box4 = new Box<Integer>(5, 3);

      System.out.println(box1);
      System.out.println(box2);

      System.out.println(box3);

      System.out.println(box4);
      box4.lock();
      System.out.println(box4.isLocked());
      System.out.println(box4);
    } catch (IllegalStateException e) {
      System.out.println("Class is currently locked!");
    }
  }
}
