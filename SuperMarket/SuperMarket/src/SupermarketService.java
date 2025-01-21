import java.util.List;

public interface SupermarketService {

  void printInitialStock();

  void printInitialCash();

  void printUpdatedStock();

  void printUpdatedCash();

  Product promptProduct();

  double promptCash();

  List<Double> payForProduct(Product product);

  void buyProduct();
}
