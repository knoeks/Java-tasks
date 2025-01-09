
import account.Account;

public class Main {
  public static void main(String[] args) {

//    Circle small = new Circle();
//    System.out.println(small.getRadius() + " " +  small.getArea());
//
//    Circle normal = new Circle(5);
//    System.out.println("normal: " + normal.getRadius() + " " +  normal.getArea());
//    normal.setRadius(6);
//    System.out.println("normal: " +  normal.getRadius() + " " +  normal.getArea());
//
//    Circle big = new Circle(10, "black");
//    big.setColor("White");
//    System.out.println(big.getRadius() + " " +  big.getArea() + " " + big.getColor());
//
//    System.out.println(big.toString());

//    Employee Darius = new Employee(1, "Darius", "Jurchevic", 5000);
//    System.out.println(Darius.toString());
//
//    Darius.setSalary(4000);
//    System.out.println(Darius.toString());
//
//
//    System.out.println(Darius.raiseSalary(10));

    Account Povilas = new Account("1", "Povilas Gegužis", 1000);
    Account Darius = new Account("2", "Darius Jurchevic", 1000);

    System.out.println(Povilas.transferTo(Darius, 100));
    System.out.println(Darius.getBalance());

    Darius.debit(100);
    System.out.println(Darius.toString());

  }
}