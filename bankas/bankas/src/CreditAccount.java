import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditAccount extends BankAccount {
  private final double interestRate;
  private int limit;

  public CreditAccount(String owner, double interestRate, int limit) {
    super(owner);
    this.interestRate = interestRate;
  }

  public CreditAccount(String owner, BigDecimal balance, double interestRate) {
    super(owner, balance);
    this.interestRate = interestRate;
  }

  public void withdrawCash(double amount) {
    if (amount > 0 && (super.getBalance().subtract(new BigDecimal(amount)).compareTo(BigDecimal.ZERO) < limit)) {
      super.setBalance(super.getBalance().add(new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP)));
    } else {
      throw new IllegalArgumentException("Amount can't be negative");
    }
  }

  public double getMonthlyInterestRate(){
    return interestRate;
  }

  public BigDecimal getMonthlyInterest() {
    return super.getBalance().multiply(new BigDecimal(interestRate)).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
  }
}
