import java.util.ArrayList;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    Square square = new Square(2.0, "red", true);
    Circle circle = new Circle(2.0, "red", true);

//    System.out.println(circle);
//    System.out.println(square);

    ArrayList<Shape> shapes = new ArrayList<>();

    shapes.add(circle);
    shapes.add(square);

    for (Shape shape : shapes) {
      System.out.println(shape);
    }

    System.out.println(shapes.stream().mapToDouble(Shape::getArea).sum());
    System.out.println(shapes.stream().max(Comparator.comparingDouble(Shape::getPerimeter)).orElse(null).getPerimeter());
    shapes.stream()
            .filter(shape -> shape instanceof Rectangle)
            .forEach(shape -> {
              Rectangle rectangle = (Rectangle) shape;
              System.out.println(rectangle.getLength() + " " + rectangle.getWidth());
            });
  }
}
