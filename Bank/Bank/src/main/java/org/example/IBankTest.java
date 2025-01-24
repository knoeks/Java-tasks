package org.example;

import ibank.Bank;
import ibank.BaseBankTest;

public class IBankTest extends BaseBankTest {

  @Override
  protected Bank createBank() {
    return new SwedBank();
  }
}
