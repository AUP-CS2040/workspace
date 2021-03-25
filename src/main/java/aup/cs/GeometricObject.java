package aup.cs;

import java.util.Date;

public abstract class GeometricObject {

  private String color;
  private boolean filled;
  private Date created;

  protected GeometricObject() {
    this("black", false);
  }

  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
    created = new Date();
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public Date getDateCreated() {
    return created;
  }

  public abstract String toString();

  public String getInfo() {
    return "color: " + getColor() + ", isFilled: " + isFilled() + ", created on: " + getDateCreated().toString();
  }

  public abstract double getArea();

  public abstract double getPerimeter();
}
