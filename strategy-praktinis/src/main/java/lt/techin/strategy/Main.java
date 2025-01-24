package lt.techin.strategy;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Warehouse warehouse = new WarehouseImpl();
    List<Product> products = List.of(new Product("207", 2000, "Peugeot"),
            new Product("A1", 25000, "Audi"),
            new Product("3 Series", 10000, "BMW"),
            new Product("A7", 40000, "Audi"),
            new Product("M1", 550000, "BMW"),
            new Product("Roma", 280000, "Ferrari"),
            new Product("Revuelto", 640000, "Lamborghini")
    );

    warehouse.addProducts(products);

    warehouse.getNumberOfProducts();

    warehouse.executeFilteringStrategy(new FilterStrategyBMW()).forEach(item -> System.out.print(item.getName() + " "));
    System.out.println();
    warehouse.executeFilteringStrategy(new FilterStrategyHighRange()).forEach(item -> System.out.print(item.getName() + " "));
    System.out.println();
    warehouse.executeFilteringStrategy(new FilterStrategyLowRange()).forEach(item -> System.out.print(item.getName() + " "));
    System.out.println();

  }
}
