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

  public void add(int index, T item) {
    this.add(item);
  }

  public T set(int index, T item) {
    T temp = super.get(index);
    super.remove(index);
    this.add(item);
    return temp;
  }

  public int index(T item) {
    int index = 0;
    if (item.compareTo(super.get(0))<0) {
      return 0;
    }

    if (item.compareTo(super.get(super.size()-1))>0) {
      return super.size();
    }

    for (int i = 0; i<super.size(); i++) {
      T element = super.get(i);
      if (item.compareTo(element)==0) {
        return i;
      }
      if (i!= super.size()-1 && item.compareTo(element)>0 && item.compareTo(super.get(i+1))<0) {
        return i+1;
      }
    }

    return index;
  }

}
