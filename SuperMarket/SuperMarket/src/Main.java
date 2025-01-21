import Exceptions.CancelPurchaseException;

public class Main {
  public static void main(String[] args) {
    CashRegister register = new CashRegister();
    register.add(0.1, 0);
    register.add(0.2, 0);
    register.add(0.5, 30);
    register.add(1, 10);
    register.add(2, 20);

    register.PrintAscDenominations();

    System.out.println("Initial Cash Inventory:");
    System.out.println(register);

    ProductStorage storage = new ProductStorage();
    storage.add(new Product("bread", 1, 10));
    storage.add(new Product("egg", 0.5, 20));
    storage.add(new Product("book", 2.5, 30));

    System.out.println(storage.productExist("bread"));
    System.out.println(storage.inStock("bread"));
    System.out.println(storage);
    storage.confirmPurchase("bread");

    System.out.println(storage);


    System.out.println("-------------------------------------------------");
    SupermarketService market = new SupermarketServiceImpl(storage, register);

    while (true) {
      try {
        market.printInitialCash();
        market.printInitialStock();

        market.buyProduct();

        market.printUpdatedCash();
        market.printUpdatedStock();
        System.out.println("\n");
      } catch (CancelPurchaseException e) {
        System.out.println("aborting purchase");
        return;
      }
    }
  }
}