package aup.cs;

public class Donkey extends Animal implements Braying {
  public Donkey() {
    super(150.0);
  }

  public String bray() {
    return "Iaa";
  }

  public String sound() {
    return bray();
  }

}
