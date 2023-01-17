package TreeSetAssign;
import java.util.*;
public class P14 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);
        ts.add(7);
        ts.add(8);
        ts.add(9);
        System.out.println(ts);
        //System.out.println(ts.pollFirst());
        //System.out.println(ts.pollLast());
        //System.out.println(ts.remove(7));
        //System.out.println(ts);
        Comparator comp=ts.comparator();
        System.out.println(comp);
    }
}
