import java.util.ArrayList;

public class Books {
  ArrayList<Book> books;

  public Books() {
    this.books = new ArrayList<>();
  }

  public void add(Book book) {
    this.books.add(book);
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append(books.size()).append(" books in total.\n\n").append("Books:\n");
    for (Book book : books) {
      str.append(book.toString()).append("\n");
    }
    return str.toString();
  }

  public void sortByAgeAndName(){
    books.sort(new SortByAgeAndName());
  }

  public void sortByAge(){
    books.sort(new SortByAge());
  }
}
