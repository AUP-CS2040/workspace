package aup.cs.db;

public class Test {
  public static void main(String[]  args) {
    Database db = new LinkedListDatabase();
    db.insert(new TaxRecord(new StringKey("name1")));
    db.insert(new TaxRecord(new StringKey("name2")));
    db.insert(new TaxRecord(new StringKey("name1")));
    System.out.println(db.toString());
    db.delete(new StringKey("name1"));
    try {
      Record record = db.find(new StringKey("name2"));
      System.out.println(record.toString());
    } catch (RecordNotFoundException rnfe) {
      System.err.println(rnfe.getMessage());
    }
    System.out.println(db.toString());
  }
}

/*
1. Work on a real example with abstract classes and interfaces
2. When to use interfaces and when to use abstract classes
3. How to use visibility modifiers for code abuse
4. Go over ex6
*/
