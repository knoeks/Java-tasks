package Exceptions;

public class CancelPurchaseException extends RuntimeException {
  public CancelPurchaseException(String message) {
    super(message);
  }
}
