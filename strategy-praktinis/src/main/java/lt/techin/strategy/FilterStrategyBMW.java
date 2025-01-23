package lt.techin.strategy;

public class FilterStrategyBMW implements FilteringStrategy{

  @Override
  public boolean filter(Product product) {
    return product.getManufacturer().contains("BMW");
  }
}
