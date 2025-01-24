package org.example;

import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class PhoneAdapter implements Phone {

  MobilePhone mobilePhone;

  public PhoneAdapter(MobilePhone mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  @Override
  public void dial(String s) {
    mobilePhone.dial(s);
  }

  @Override
  public String getReponse() {
    return "Response get got";
  }
}
