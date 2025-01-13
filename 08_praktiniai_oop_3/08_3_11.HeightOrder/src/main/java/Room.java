import java.util.ArrayList;
import java.util.Comparator;

public class Room {
  private ArrayList<Person> room;

  public Room() {
    room = new ArrayList<>();
  }

  public void add(Person person) {
    room.add(person);
  }

  public boolean isEmpty() {
    return room.isEmpty();
  }

  public ArrayList<Person> getPersons() {
    return room;
  }

  public Person shortest() {
    return room.stream().min(Comparator.comparingInt(Person::getHeight)).orElse(null);
  }

  public Person take() {
    Person shortest = room.stream().min(Comparator.comparingInt(Person::getHeight)).orElse(null);
    if (shortest != null) {
      room.remove(shortest);
    }
    return shortest;
  }
}
