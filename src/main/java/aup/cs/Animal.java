package aup.cs;

public abstract class Animal implements Comparable {
  private double weight;

  public int compareTo(Object other) {
    if (other instanceof Animal) {
      return (int)(getWeight() - ((Animal)other).getWeight());
    } else if (other instanceof Fruit) {
      return -1;
    } else {
      throw new RuntimeException("Cannot compare");
    }
  }

  protected Animal(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public abstract String sound();
}
