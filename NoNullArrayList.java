public class NoNullArrayList<T> extends ArrayList<T> {
  private ArrayList<T> arr;

  public NoNullArrayList() {
    arr = new ArrayList<T>();
  }

  public NoNullArrayList(int capacity) {
    arr = new ArrayList<T>(capacity);
  }
}
