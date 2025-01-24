package org.example;

import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Bank swedBank = new SwedBank();

    Account account = swedBank.openDebitAccount("John");
    account.deposit(BigDecimal.ONE);
    System.out.println(account.withdraw(BigDecimal.ONE));
    System.out.println(account.getBalance());
  }
}