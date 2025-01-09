
public class Main {
  public static void main(String[] args) {
    int[] values = {6, 5, 8, 7, 11};
    for (int i = 0; i < values.length; i++) {
      int smallestNumIndex = indexOfTheSmallestStartingFrom(values, i);
      swap(values, i, smallestNumIndex);
    }
    for (int num : values) {
      System.out.println(num);
    }
  }

  public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    int smallestNum = Integer.MAX_VALUE;
    int smallestNumIndex = 0;
    for (int i = index; i < array.length; i++) {
      if (smallestNum > array[i]) {
        smallestNum = array[i];
        smallestNumIndex = i;
      }
    }
    return smallestNumIndex;
  }

  public static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}