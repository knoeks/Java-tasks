import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.UUID;

public abstract class BankAccount implements Withdrawable {
  private final UUID accountID;
  private String owner;
  private BigDecimal balance;
  private final LocalDate dateOpened;

  public BankAccount(String owner) {
    this.accountID = UUID.randomUUID();
    this.owner = owner;
    dateOpened = LocalDate.now();
  }

  public BankAccount(String owner, BigDecimal balance) {
    this.accountID = UUID.randomUUID();
    this.owner = owner;
    this.balance = balance.setScale(2, RoundingMode.HALF_UP);
    dateOpened = LocalDate.now();
  }

  public void depositCash(double amount) {
    if (amount > 0) {
      this.balance = balance.add(new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP));
    } else {
      throw new IllegalArgumentException("Amount can't be negative");
    }
  }



  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public LocalDate dateCreated() {
    return dateOpened;
  }

  public String getOwner() {
    return owner;
  }

  public UUID getAccountID() {
    return accountID;
  }
}
