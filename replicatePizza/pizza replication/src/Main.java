public class Main {
  public static void main(String[] args) {
    Pizza pizza = new ThinCrustPizza();

    Pizza olives = new Olives(pizza);
  }
}