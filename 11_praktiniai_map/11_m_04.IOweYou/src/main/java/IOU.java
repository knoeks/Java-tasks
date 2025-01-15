import java.util.HashMap;

public class IOU {
  private HashMap<String, Double> people;

  public IOU() {
    people = new HashMap<>();
  }

  public void setSum(String toWhom, double amount) {
    people.put(toWhom, amount);
  }

  public double howMuchDoIOweTo(String toWhom){
    return people.getOrDefault(toWhom, 0.0);
  }
}
