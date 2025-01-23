package lt.techin.strategy;

public class FilterStrategyLowRange implements FilteringStrategy{
  public boolean filter(Product product) {
    return product.getPrice() < 10000;
  }
}
