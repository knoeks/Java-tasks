package lt.techin.strategy;

import java.util.ArrayList;
import java.util.List;

public class WarehouseImpl implements Warehouse {
  List<Product> products;

  public WarehouseImpl() {
    this.products = new ArrayList<>();
  }

  @Override
  public void addProducts(List<Product> products) {
    this.products.addAll(products);
  }

  @Override
  public int getNumberOfProducts() {
    return products.size();
  }

  @Override
  public List<Product> executeFilteringStrategy(FilteringStrategy strategy) {
    return products.stream().filter(strategy::filter).toList();
  }
}
