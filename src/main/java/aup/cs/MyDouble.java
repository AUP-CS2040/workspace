package aup.cs;

public class MyDouble extends MyNumber {
  private double val;
  public MyDouble(double val) {
    this.val = val;
  }

  public double getVal() {
    return val;
  }

  public int compareTo(MyNumber other) {
    if (other instanceof MyDouble) {
      return compareTo((MyDouble)other);
    } else {
      throw new RuntimeException("bad");
    }
  }

  public int compareTo(MyDouble other) {
      double val2 =other.getVal();
      if (val > val2) {
        return 1;
      } else if (val2 > val) {
        return -1;
      } else {
        return 0;
      }
  }

  public String toString() {
    return ""+val;
  }
}
