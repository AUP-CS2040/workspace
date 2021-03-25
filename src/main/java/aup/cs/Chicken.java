package aup.cs;

public class Chicken extends Animal implements Edible {

  public Chicken() {
    super(5.1);
  }

  public String sound() {
    return "Like a chicken";
  }

  public String howToEat() {
    return "With fork and knife";
  }
}
