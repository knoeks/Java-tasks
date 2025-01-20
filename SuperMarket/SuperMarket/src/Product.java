import java.util.Objects;

public class Product {
  private String name;
  private double price;
  private int stockQuantity;

  public Product(String name, double price, int stockQuantity) {
    this.name = name;
    this.price = price;
    this.stockQuantity = stockQuantity;
  }

  public String getName() {
    return name;
  }

  public int getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(int stockQuantity) {
    this.stockQuantity = stockQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
