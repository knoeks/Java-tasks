package Exceptions;

public class PayNotAcceptedException extends RuntimeException {
  public PayNotAcceptedException(String message) {
    super(message);
  }
}
