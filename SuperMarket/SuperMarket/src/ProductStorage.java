import Exceptions.SoldOutException;

import java.util.HashMap;

public class ProductStorage {
  private final HashMap<String, Product> products;

  public ProductStorage() {
    this.products = new HashMap<>();
  }

  public void add(Product product){
    products.put(product.getName(), product);
  }

  public String getProduct(String name) {

    // 1) paziuret ar egzistuoja liste
    try {
      if (!products.containsKey(name)) {
        throw new IllegalArgumentException();
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Error: Product not available!");
    }

    // galima saugiai susikurt produkto kintamaji
    Product product = products.get(name);
    // 2) paziuret ar count != 0
    try {
      if (product.getStockQuantity() < 1) {
        throw new SoldOutException("Out of stock.");
      }
    } catch (SoldOutException e) {
      System.out.println("We are currently out of product. Sorry!");
    }

    // cia jau praejo visus tikrinimus
    // todel galima "rezervuoti" preke
    product.setStockQuantity(product.getStockQuantity() - 1);

    return name;
  }

  public void returnProduct(String name) {
    // saugu nes jau saugomas egzistuojancio kintamojo vardas
    Product product = products.get(name);
    product.setStockQuantity(product.getStockQuantity() + 1);
  }
}
