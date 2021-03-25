package aup.cs.db;

public class StringKey extends Key {
  private String value;
  public StringKey(String value) {
    this.value = value;
  }

  public int hashCode() {
    return value.hashCode();
  }

  public boolean equals(Object other) {
    assert other instanceof StringKey;
    return value.equals(((StringKey)other).value);
  }
}
