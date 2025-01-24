package org.example;

import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class Main {
  public static void main(String[] args) {
    MobilePhone modern = new MobilePhone();
    Phone test = new PhoneAdapter(modern);

    AutomaticDialer featureTest = new AutomaticDialer();
    System.out.println(AutomaticDialer.dial(test));
  }
}