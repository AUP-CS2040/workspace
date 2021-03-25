package aup.cs;

public class Mule extends Animal implements Braying {

  public Mule() {
    super(130.0);
  }

  public String bray () {
    return "iaaa";
  }

  public String sound() {
    return bray();
  }

}
