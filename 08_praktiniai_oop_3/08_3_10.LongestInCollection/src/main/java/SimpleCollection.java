
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class SimpleCollection {

  private String name;
  private ArrayList<String> elements;

  public SimpleCollection(String name) {
    this.name = name;
    this.elements = new ArrayList<>();
  }

  public void add(String element) {
    this.elements.add(element);
  }

  public ArrayList<String> getElements() {
    return this.elements;
  }

  public String longest() {
    if (!elements.isEmpty()) {
      return elements.stream().max(Comparator.comparingInt(String::length)).get();
    }
    return null;
  }
}
