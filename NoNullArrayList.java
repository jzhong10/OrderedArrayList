import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  private ArrayList<T> arr;

  public NoNullArrayList() {
    arr = new ArrayList<T>();
  }

  public NoNullArrayList(int capacity) {
    arr = new ArrayList<T>(capacity);
  }

  public boolean add(T item) {
    if (item==null) {
      throw new IllegalArgumentException("no Null values accepted");
    }
    return super.add(item);
  }
}
