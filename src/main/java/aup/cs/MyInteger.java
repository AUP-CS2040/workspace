package aup.cs;

public class MyInteger extends MyNumber {
  private int val;
  public MyInteger(int val) {
    this.val = val;
  }

  public double getVal() {
    return val;
  }

  public int compareTo(MyNumber other) {
    if (other instanceof MyInteger) {
      return val - ((MyInteger)other).val;
    }
    else throw new RuntimeException("Cannot compare MyInteger with " + other.toString());
  }

  public String toString() {
    return ""+val;
  }
}
