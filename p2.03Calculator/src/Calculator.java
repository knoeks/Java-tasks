public class Calculator {
  private final Reader reader;

  public Calculator() {
    reader = new Reader();
  }

  public void start() {
    while (true) {
      System.out.println("command: ");
      String command = reader.readString();

      switch (command) {
        case "end":
          //statistics();
          return;
        case "sum":
          sum();
          break;
        case "difference":
//          difference();
          break;
        case "product":
//          product();
          break;
      }
    }
  }

  private void sum() {
    System.out.println("value1: ");
    int value1 = reader.readInteger();

    System.out.println("value2: ");
    int value2 = reader.readInteger();

    System.out.println("sum of the values " + value1 + value2);
  }
}
