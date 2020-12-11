import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private NoNullArrayList<T> arr;

  public OrderedArrayList() {
    arr = new NoNullArrayList<T>();
  }

  public OrderedArrayList(int capacity) {
    arr = new NoNullArrayList<T>(capacity);
  }

  public boolean add(T item) {

    if (super.size()==0) {
      super.add(item);
      return true;
    }

    //function index determines proper index
    int index = index(item);

    super.add(index, item);
    return true;
  }

  public int index(T item) {
    int index = 0;
    for (int i = 0; i<super.size(); i++) {
      T element = super.get(i);
      if (item.compareTo(element)==0) {
        return i;
      }
    }

    return index;
  }

}
