import java.util.LinkedList;
import java.util.List;

public class Pipe<T> {
  LinkedList<T> list;

  public Pipe() {
    this.list = new LinkedList<>();
  }

  public void putIntoPipe(T value){
    list.addLast(value);
  }

  public T takeFromPipe() {
    return list.removeFirst();
  }

  public boolean isInPipe() {
    return !list.isEmpty();
  }
}
