public class Box<T extends Comparable<T>> {
  private final T value1;
  private final T value2;
  private boolean locked = false;

  public Box(T value1, T value2) {
    if (value1.compareTo(value2) < 0) {
      this.value1 = value1;
      this.value2 = value2;
    } else {
      this.value1 = value2;
      this.value2 = value1;
    }
  }

  public void lock() {
    this.locked = true;
  }

  public void unlock() {
    this.locked = false;
  }

  public boolean isLocked() {
    return locked;
  }

  public T getValue1() {
    if (this.locked) {
      throw new IllegalStateException("cannot access while class is locked");
    }
    return value1;
  }

  public T getValue2() {
    if (this.locked) {
      throw new IllegalStateException("cannot access while class is locked");
    }
    return value2;
  }

  @Override
  public String toString() {
    if (this.locked) {
      throw new IllegalStateException("cannot access while class is locked");
    }
    return "value1=" + value1 +
            ", value2=" + value2;
  }

}

