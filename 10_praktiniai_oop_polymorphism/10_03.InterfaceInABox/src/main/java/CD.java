public class CD implements Packable {
  private final String author;
  private final String name;
  private final int year;
  private final double weight = 0.1;

  public CD(String author, String name, int year) {
    this.author = author;
    this.name = name;
    this.year = year;
  }

  @Override
  public double weight() {
    return this.weight;
  }

  public String toString() {
    return author + ": " + name + " (" + this.year + ")";
  }
}
