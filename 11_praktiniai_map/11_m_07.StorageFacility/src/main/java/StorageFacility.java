import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StorageFacility {
  private HashMap<String, ArrayList<String>> units;

  public StorageFacility() {
    units = new HashMap<>();
  }

  public void add(String unit, String item) {
    units.putIfAbsent(unit, new ArrayList<>());
    units.get(unit).add(item);
  }

  public ArrayList<String> contents(String storageUnit){
    return units.getOrDefault(storageUnit, new ArrayList<>());
  }

  public void remove(String storageUnit, String remove){
    units.get(storageUnit).remove(remove);
    if (units.get(storageUnit).isEmpty()){
      units.remove(storageUnit);
    }

  }

  public ArrayList<String> storageUnits() {
    System.out.println(new ArrayList<>(units.keySet()));
    return new ArrayList<>(units.keySet());

  }
}
