import java.util.ArrayList;
import java.util.Arrays;
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
      System.out.println();
      System.out.println(a1.get(3));
      a1.add(3, 9481092);
      System.out.println(a1.get(3));

      System.out.println(a1.get(0));
      a1.set(0, 9481092);
      System.out.println(a1.get(0));
      //a1.set(0, null);
      System.out.println(a1.get(0));

      System.out.println();
      System.out.println();
      System.out.println();

      OrderedArrayList<Integer> od = new OrderedArrayList<Integer>();

       // for (int i = 0; i<=5; i++) {
       //   od.add(i);
       //   System.out.println(od.get(i));
       // }

       for (int i = 5; i>=1; i-=2) {
         od.add(i);
         System.out.println(od.toString());
       }

       System.out.println(od.toString());
       System.out.println();

       for (int i = 1; i<=5; i+=2) {
         od.add(i);
         System.out.println(od.toString());
       }

       od.add(4);
       od.add(2);
       System.out.println(od.toString());
       od.add(7);
       System.out.println(od.toString());

       od.clear();
       System.out.println(od.toString());

       for (int i = 0; i<=10; i+=2) {
         od.add(i);
         od.add(i+2);
       }

       for (int i = -3; i<0; i++) {
         od.add(i);
       }

       od.add(1);
       od.add(17);
       od.add(17);
       od.add(12);
       for (int i = 1; i<=5; i++) {
         od.add(i);
         od.add(i);
       }
       od.add(0);
       System.out.println(od.toString());

       System.out.println();
       System.out.println();
       System.out.println();

       od.clear();

       for (int i = 5; i>=1; i-=2) {
         od.add(i);
         od.add(i);
       }

       for (int i = 6; i>=0; i--) {
         od.add(i);
         od.add(i);
       }

       System.out.println(od.toString());

       System.out.println();
       System.out.println();
       System.out.println();

       od.clear();

       for (int i = 1; i<10; i+=2) {
         od.add(0, i);
         System.out.println(i);
       }

       for (int i = 7; i>=0; i--) {
         od.add(12893429, i);
         od.add(23392819, i);
       }
       System.out.println(od.toString());


       //od.add(null);
       //od.add(2423, null);
       System.out.println();
       System.out.println();
       System.out.println();

       od.clear();

       for (int i = 0; i<=5; i++) {
         od.add((int) (100 * Math.random()));
       }
       System.out.println(od.toString());

       int[] nums = new int[6];
       for (int i = 0; i<=5; i++) {
         nums[i] = (int) (100 * Math.random());
       }

       System.out.println();
       System.out.println(Arrays.toString(nums));
       System.out.println();

       for (int i = 0; i<=5; i++) {
         od.set(i, nums[i]);
         System.out.println(od.toString());

       }
       System.out.println(od.toString());

       System.out.println("String testing time");
       System.out.println();
       System.out.println();
       System.out.println();
    }

}
