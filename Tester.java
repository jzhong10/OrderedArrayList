import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
      ArrayList<String> str = new ArrayList<String>(1);
      str.add("hi");
      System.out.println(str.add("hi"));
      System.out.println(str.get(0));
      System.out.println(str.get(1));

      NoNullArrayList<Integer> a1 = new NoNullArrayList<Integer>(4);
      //System.out.println(a1.size());
      a1.add(9);
      System.out.println(a1.get(0));
      //a1.add(null);
      //System.out.println();

      for (int i = 0; i<=5; i++) {
        a1.add(i, i);
        System.out.println(a1.get(i));
      }
      //a1.add(3, null);
      //System.out.println();
      System.out.println(a1.get(3));
      a1.set(3, 9481092);
      System.out.println(a1.get(3));

    }

}