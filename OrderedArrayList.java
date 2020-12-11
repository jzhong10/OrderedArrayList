import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private NoNullArrayList<T> arr;

  public OrderedArrayList() {
    arr = new NoNullArrayList<T>();
  }

  public OrderedArrayList(int capacity) {
    arr = new NoNullArrayList<T>(capacity);
  }

}
