public class Main {
  public static void main(String[] args) {
    CashRegister register = new CashRegister();
    register.add(0.1, 10);
    register.add(0.2, 20);
    register.add(0.5, 30);
    register.add(1, 10);
    register.add(2, 20);

    register.PrintDenominations();

    System.out.println("Initial Cash Inventory:");
    System.out.println(register);

    System.out.println(register.returnChange(3.6));
  }
}