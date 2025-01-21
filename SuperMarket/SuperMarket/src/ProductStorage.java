import Exceptions.SoldOutException;

import java.util.HashMap;

public class ProductStorage {
  private final HashMap<String, Product> products;

  public ProductStorage() {
    this.products = new HashMap<>();
  }

  public void add(Product product) {
    products.put(product.getName(), product);
  }

  public boolean productExist(String name) {
    if (!products.containsKey(name)) {
      throw new IllegalArgumentException("Product doesnt exist.");
    }
    return products.containsKey(name);
  }

  public boolean inStock(String name) {
    boolean inStock = products.get(name).getStockQuantity() > 0;
    try {
      if (!inStock) {
        throw new SoldOutException("Sold out!");
      }
    } catch (SoldOutException e) {
      System.out.println("Product is currently out of stock!");
    }
    return inStock;
  }

  public Product getProduct(String name) {
    productExist(name);
    inStock(name);
    return products.get(name);
  }

  public void confirmPurchase(String name) {
    products.get(name).buyOne();
  }

  public String toString() {
    StringBuilder str = new StringBuilder();
    products.forEach((key, value) -> str.append(key.toUpperCase()).append(" quantity: ").append(value.getStockQuantity()).append("\n"));
    return str.toString();
  }
}
