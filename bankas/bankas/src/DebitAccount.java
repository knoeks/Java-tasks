import java.math.BigDecimal;
import java.math.RoundingMode;

public class DebitAccount extends BankAccount {

  public DebitAccount(String owner) {
    super(owner);
  }

  public DebitAccount(String owner, BigDecimal balance) {
    super(owner, balance);
  }

  public void withdrawCash(double amount) {
    if (amount > 0 && (super.getBalance().subtract(new BigDecimal(amount)).compareTo(BigDecimal.ZERO) < 0)) {
      super.setBalance(super.getBalance().add(new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP)));
    } else {
      throw new IllegalArgumentException("Amount can't be negative");
    }
  }
}
