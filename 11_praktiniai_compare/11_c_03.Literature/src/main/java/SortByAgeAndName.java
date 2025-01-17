import java.util.Comparator;

public class SortByAgeAndName implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    if ((o1.getAgeRecommendation() - o2.getAgeRecommendation()) != 0) {
      return o1.getAgeRecommendation() - o2.getAgeRecommendation();
    } else {
      return o1.getName().compareTo(o2.getName());
    }
  }
}
