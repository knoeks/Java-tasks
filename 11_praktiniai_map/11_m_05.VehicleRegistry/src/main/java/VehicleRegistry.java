import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {
  private HashMap<LicensePlate, String> mapPlates;

  public VehicleRegistry() {
    mapPlates = new HashMap<>();
  }

  public boolean add(LicensePlate licensePlate, String owner) {
    return mapPlates.putIfAbsent(licensePlate, owner) == null;
  }

  public String get(LicensePlate licensePlate) {
    return mapPlates.getOrDefault(licensePlate, null);
  }

  public boolean remove(LicensePlate licensePlate) {
    return mapPlates.remove(licensePlate) != null;
  }

  public void printLicensePlates() {
    mapPlates.keySet().forEach(System.out::println);
  }

  public void printOwners() {
    HashSet<String> uniqueOwners = new HashSet<>();
    mapPlates.values().stream().filter(uniqueOwners::add).forEach(System.out::println);
  }
}
