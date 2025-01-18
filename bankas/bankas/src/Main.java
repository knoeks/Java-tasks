import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    CreditAccount test = new CreditAccount("pov", new BigDecimal("200.55"), 3.5);
    System.out.println(test.getMonthlyInterest());
    System.out.println(test.dateCreated());
    System.out.println(test.getAccountID());
    System.out.println(test.getOwner());
  }
}