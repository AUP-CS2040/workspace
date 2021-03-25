package aup.cs.db;

public interface Database {
  void insert(Record record);

  void delete(Key key);

  Record find(Key key) throws RecordNotFoundException;

  String toString();
}
