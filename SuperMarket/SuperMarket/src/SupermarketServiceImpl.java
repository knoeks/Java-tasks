import Exceptions.CancelPurchaseException;
import Exceptions.OutOfChangeException;
import Exceptions.PayNotAcceptedException;
import Exceptions.SoldOutException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SupermarketServiceImpl implements SupermarketService {
  private final ProductStorage storage;
  private final CashRegister register;
  Scanner scanner = new Scanner(System.in);
  private static SupermarketServiceImpl instance;

  private SupermarketServiceImpl(ProductStorage storage, CashRegister register) {
    this.storage = storage;
    this.register = register;
  }

  public static synchronized SupermarketServiceImpl getInstance(ProductStorage storage, CashRegister register) {
    if (instance == null) {
      instance = new SupermarketServiceImpl(storage, register);
    }
    return instance;
  };

  @Override
  public void printInitialStock() {
    System.out.println("Initial Product inventory:");
    System.out.println(storage);
  }

  @Override
  public void printInitialCash() {
    System.out.println("Initial Stock inventory:");
    System.out.println(register);
  }

  @Override
  public void printUpdatedStock() {
    System.out.println("Updated Product inventory:");
    System.out.println(storage);
  }

  @Override
  public void printUpdatedCash() {
    System.out.println("Updated Stock inventory:");
    System.out.println(register);
  }

  @Override
  public Product promptProduct() {
    System.out.print("What would you like to buy? Type in the name of the desired product: ");
    String str = scanner.nextLine();
    if (str.isEmpty()) {
      throw new CancelPurchaseException("Request to cancel purchase");
    }
    Product product = storage.getProduct(str);
    System.out.println("You are trying to buy " + product.getName() + ". You need to pay " + product.getPrice() + ".");
    return product;
  }

  @Override
  public double promptCash() {
    while (true) {
      try {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
          throw new CancelPurchaseException("Request to cancel purchase");
        }
        if (register.coinExists(input)) {
          return Double.parseDouble(input);
        }
      } catch (PayNotAcceptedException e) {
        System.out.print("Pay not accepted. Try again: ");
      }
    }
  }

  @Override
  public List<Double> payForProduct(Product product) {
    ArrayList<Double> coins = new ArrayList<>();
    System.out.println("Provide bill or coin (accepted values: " + register.PrintAscDenominations() + "): ");
    while (coins.stream().mapToDouble(Double::doubleValue).sum() < product.getPrice()) {
      if (!coins.isEmpty()) {
        System.out.println("You still need to pay " + (BigDecimal.valueOf(product.getPrice() - coins.stream().mapToDouble(Double::doubleValue).sum())).setScale(2, RoundingMode.HALF_UP));
      }
      coins.add(promptCash());
      System.out.println("You paid " + coins.stream().mapToDouble(Double::doubleValue).sum() + " in total.");
    }

    System.out.println();
    return coins;
  }

  @Override
  public void buyProduct() {
    try {
      Product product = promptProduct();
      List<Double> coins = payForProduct(product);
      register.getChange(coins, product.getPrice());
      storage.confirmPurchase(product.getName());
    } catch (IllegalArgumentException e) {
      System.out.println("Error: Product not available");
    } catch (SoldOutException e) {
      System.out.println("Out of Stock!");
    } catch (PayNotAcceptedException e) {
      System.out.println("unrecognised currency type");
    } catch (OutOfChangeException e) {
      System.out.println("Out of change!");
    }
  }
}
