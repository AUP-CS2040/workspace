package aup.cs.db;

public abstract class Record {
  private Key key;
  public Record(Key key) {
    this.key = key;
  }
  public Key getKey() {
    return key;
  }
  public int hashCode() {
    return key.hashCode();
  }
  public boolean equals(Object other) {
    assert other instanceof Record;
    return key.equals(((Record)other).getKey());
  }
}
