package aup.cs;

public class Circle extends GeometricObject {
  private double radius;

  public Circle() {
    this(0.0);
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double radius, String color, boolean filled) {
    super(color,filled);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getDiameter() {
    return 2 * radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  public String toString() {
    return "Cirlce [radius: " + getRadius() + ", area: " + getArea() + ", perimeter: " + getPerimeter() + ", " + getInfo() + "]";
  }
}
