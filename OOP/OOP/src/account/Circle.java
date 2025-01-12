package account;

public class Circle {

    private double radius = 1.0;
    private String color = "red";


    // constructors:
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // setters:
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // getters:
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public String getColor() {
        return color;
    }

    // toString:
    @Override
    public String toString() {
        return "account.Circle[radius = " + radius + " color = " + color + "]";
    }
}

