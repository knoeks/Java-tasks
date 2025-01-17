public class Hideout<T> {
  private T object;

  public Hideout() {
    object = null;
  }

  public void putIntoHideout(T object) {
    this.object = object;
  }

  public T takeFromHideout() {
    T temp = object;
    object = null;
    return temp;
  }

  public boolean isInHideout() {
    return object != null;
  }
}

