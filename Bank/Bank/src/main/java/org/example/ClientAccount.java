package org.example;

import ibank.Account;

import java.math.BigDecimal;
import java.util.UUID;

public class ClientAccount implements Account {
  private String number;
  private String name;
  private BigDecimal balance;
  private BigDecimal creditLimit = BigDecimal.ZERO;

  public ClientAccount(String name) {
    this.number = UUID.randomUUID().toString();
    this.name = name;
    this.balance = BigDecimal.ZERO;
  }

  public ClientAccount(String name, BigDecimal creditLimit) {
    this.number = UUID.randomUUID().toString();
    this.name = name;
    this.balance = BigDecimal.ZERO;
    this.creditLimit = creditLimit.negate();
  }

  @Override
  public String getNumber() {
    return number;
  }

  @Override
  public String getHolderName() {
    return name;
  }

  @Override
  public BigDecimal getBalance() {
    return balance;
  }

  @Override
  public boolean deposit(BigDecimal bigDecimal) {
    if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
      balance = balance.add(bigDecimal);
      return true;
    }
    return false;
  }

  @Override
  public boolean withdraw(BigDecimal bigDecimal) {

    if (bigDecimal.compareTo(BigDecimal.ZERO) > 0 && balance.subtract(bigDecimal).compareTo(creditLimit) >= 0) {
      balance = balance.subtract(bigDecimal);
      return true;
    }
    return false;
  }


}
