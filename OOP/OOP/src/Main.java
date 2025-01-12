import account.*;

public class Main {
  public static void main(String[] args) {

//    account.Circle small = new account.Circle();
//    System.out.println(small.getRadius() + " " +  small.getArea());
//
//    account.Circle normal = new account.Circle(5);
//    System.out.println("normal: " + normal.getRadius() + " " +  normal.getArea());
//    normal.setRadius(6);
//    System.out.println("normal: " +  normal.getRadius() + " " +  normal.getArea());
//
//    account.Circle big = new account.Circle(10, "black");
//    big.setColor("White");
//    System.out.println(big.getRadius() + " " +  big.getArea() + " " + big.getColor());
//
//    System.out.println(big.toString());

//    account.Employee Darius = new account.Employee(1, "Darius", "Jurchevic", 5000);
//    System.out.println(Darius.toString());
//
//    Darius.setSalary(4000);
//    System.out.println(Darius.toString());
//
//
//    System.out.println(Darius.raiseSalary(10));

//    Account Povilas = new Account("1", "Povilas Gegužis", 1000);
//    Account Darius = new Account("2", "Darius Jurchevic", 1000);
//
//    System.out.println(Povilas.transferTo(Darius, 100));
//    System.out.println(Darius.getBalance());
//
//    Darius.debit(100);
//    System.out.println(Darius.toString());

    Date today = new Date(9, 1, 2025);
    System.out.print(today.getDay());
    System.out.print("/");
    System.out.print(today.getMonth());
    System.out.print("/");
    System.out.println(today.getYear());

    System.out.println(today.toString());

    today.setDay(12);
    today.setDate(12, 2, 1999);
    System.out.println(today.toString());

    Time now = new Time(16, 42, 0);

    System.out.println(now.toString());

    now.setTime(0, 0, 0);
    System.out.println(now.previousSecond());

    now.setTime(23, 59, 59);
    System.out.println(now.nextSecond());

  }
}