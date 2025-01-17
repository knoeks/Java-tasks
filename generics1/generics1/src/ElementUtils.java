import java.util.List;

public class ElementUtils {
  public static <T> T lastElement(List<T> list) {
    return list.getLast();
  }

  public static <T> T lastArrayElement(T[] arr) {
    return arr[arr.length - 1];
  }


}
