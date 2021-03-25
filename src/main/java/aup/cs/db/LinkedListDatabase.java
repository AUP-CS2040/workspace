package aup.cs.db;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDatabase implements Database {
  private List<Record> storage;

  public LinkedListDatabase() {
    storage = new LinkedList<Record>();
  }

  public void insert(Record record) {
    storage.add(record);
  }

  public void delete(Key key) {
    storage.remove(new LinkedListRecord(key));
  }

  public Record find(Key key) throws RecordNotFoundException {
    for (Record record : storage) {
      if (record.getKey().equals(key)) {
        return record;
      }
    }

    throw new RecordNotFoundException("Cannot find record: " + key.toString());
  }

  public String toString() {
    return storage.toString();
  }

  private class LinkedListRecord extends Record {
    public LinkedListRecord(Key key) {
      super(key);
    }
  }
}
