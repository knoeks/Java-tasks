import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
  private final List<Person> people;

  public Employees() {
    this.people = new ArrayList<Person>();
  }

  public void add(Person personToAdd) {
    people.add(personToAdd);
  }

  public void add(List<Person> peopleToAdd) {
//    peopleToAdd.forEach(people::add); same shit
    people.addAll(peopleToAdd);
  }

  public void print() {
    Iterator<Person> iterator = people.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void print(Education education) {
    Iterator<Person> iterator = people.iterator();
    while (iterator.hasNext()) {
      Person curr = iterator.next();
      if (curr.getEducation().equals(education)){
        System.out.println(curr);
      }
    }
  }

  public void fire(Education education) {
    people.removeIf(item -> item.getEducation().equals(education));
  }
}
