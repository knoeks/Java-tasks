package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().filter(user -> user.getAge() > 25).count();
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).average().orElse(0.0);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().min(Comparator.comparingInt(User::getAge)).orElseThrow(NullPointerException::new).getAge();
    }

    public static User findByName(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny().orElseThrow(NullPointerException::new);
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparingInt(User::getAge)).toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparing(User::getAge)).orElseThrow(NullPointerException::new);
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
    }

}
