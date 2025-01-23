package lt.techin.strategy;

public class FilterStrategyHighRange implements FilteringStrategy{

  @Override
  public boolean filter(Product product) {
    return product.getPrice() > 30000;
  }
}
