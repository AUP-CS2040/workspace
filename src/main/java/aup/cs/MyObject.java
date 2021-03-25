package aup.cs;

public class MyObject extends Object implements Cloneable {
  public MyObject2 val;
  public MyObject() {
    val = new MyObject2();
  }

  public Object clone() throws CloneNotSupportedException {
    MyObject ret = (MyObject)super.clone();
    ret.val = (MyObject2)val.clone();
    return ret;
  }
}
