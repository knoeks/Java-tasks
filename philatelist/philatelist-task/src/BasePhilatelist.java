import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.*;

public class BasePhilatelist implements Philatelist {
  private ArrayList<PostStamp> postStamps;

  public BasePhilatelist() {
    postStamps = new ArrayList<>();
  }

  @Override
  public void addToCollection(PostStamp postStamp) {
    if (postStamp == null || postStamp.getName() == null || postStamp.getName().isEmpty()) {
      throw new IllegalArgumentException("Error: postStamp cant be null");
    }
    postStamps.add(postStamp);
  }

  @Override
  public int getNumberOfPostStampsInCollection() {
    return postStamps.size();
  }

  @Override
  public void printAllPostStampNames() {
    postStamps.stream().map(PostStamp::getName).forEach(System.out::println);
  }

  @Override
  public void printPostStampsWithPriceGreaterThan(double v) {
    postStamps.stream().filter(item -> item.getMarketPrice() > v).map(PostStamp::getName).forEach(System.out::println);
  }

  @Override
  public boolean isPostStampInCollection(PostStamp postStamp) {
    return postStamps.contains(postStamp);
  }

  @Override
  public boolean isPostStampWithNameInCollection(String s) {
    return postStamps.stream().anyMatch(item -> item.getName().equals(s));
  }

  @Override
  public double calculateTotalMarketPrice() {
    return postStamps.stream().mapToDouble(PostStamp::getMarketPrice).sum();
  }

  @Override
  public double getAveragePostStampPrice() {
    return postStamps.stream().mapToDouble(PostStamp::getMarketPrice).average().orElse(0.0);
  }

  @Override
  public PostStamp getTheMostExpensivePostStampByMarketValue() {
    return postStamps.stream().max(Comparator.comparingDouble(PostStamp::getMarketPrice)).orElse(null);
  }

  @Override
  public List<PostStamp> findPostStampsByNameContaining(String s) {
    return postStamps.stream().filter(postStamp -> postStamp.getName().contains(s)).toList();
  }

  @Override
  public List<PostStamp> getSortedPostStampsByName() {
    postStamps.sort(new Comparator<PostStamp>() {
      @Override
      public int compare(PostStamp o1, PostStamp o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });

    return postStamps;
  }
}

//    return Collections.sort( (List<T>)postStamps);
