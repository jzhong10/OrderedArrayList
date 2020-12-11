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

    //System.out.println("Hello");
    int index = index(item);
    System.out.println(index);
    super.add(index, item);
    return true;
  }

  public int index(T item) {
    int index = 0;
    for (int i = 0; i<arr.size(); i++) {
      T element = arr.get(i);
      if (element.compareTo(item) > 0) {
        index = i-1;
        return index;
      }
    }

    return index;
  }

}
