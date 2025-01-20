public interface SupermarketService {
  List<Product> getPoductList();

  // get name = return product if exists, else exception and "Error: Product not available"
  Product getProduct(String name);

  // for printing money
  void getTotalMoney();

  void getDenomination(double denomination);

  // if success:
  // reduce product count-- and send message
  Product deliverProduct();

  //reduces the denomination count by subtracting greedily
  // and prints current change quantity
  void calculateChange();

  // if cancel (on empty string)
  void cancelTransaction();
}
