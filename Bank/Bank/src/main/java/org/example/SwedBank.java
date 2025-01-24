package org.example;

import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SwedBank implements Bank {

  List<Account> accounts;

  public SwedBank() {
    this.accounts = new ArrayList<>();
  }

  @Override
  public int getNumberOfAccounts() {
    return accounts.size();
  }

  @Override
  public BigDecimal getTotalReserves() {
    return accounts.stream().map(Account::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add);
  }

  @Override
  public Collection<Account> getAllAccounts() {
    return accounts;
  }

  @Override
  public Account openDebitAccount(String s) {
    if (getAccountByHolderName(s) == null) {
      Account newClientAccount = new ClientAccount(s);
      accounts.add(newClientAccount);
      return newClientAccount;
    } else {
      return null;
    }

  }

  @Override
  public Account openCreditAccount(String s, BigDecimal bigDecimal) {
    if (getAccountByHolderName(s) == null) {
      Account newClientAccount = new ClientAccount(s, bigDecimal);
      accounts.add(newClientAccount);
      return newClientAccount;
    } else {
      return null;
    }
  }

  @Override
  public Account getAccountByHolderName(String s) {
    return accounts.stream().filter(item -> item.getHolderName().equals(s)).findFirst().orElse(null);
  }

  @Override
  public Account getAccountByNumber(String s) {
    return accounts.stream().filter(item -> item.getNumber().equals(s)).findFirst().orElse(null);
  }

  @Override
  public void closeAccount(Account account) {
    accounts.remove(account);
  }


}
