package HashSetAssignment;
import java.util.*;
public class P16 {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<Integer>();
        s1.add(1);
        s1.add(4);
        Set<Integer> s2=new HashSet<Integer>();
        s2.add(1);
        s2.add(3);
        s2.removeAll(s1);
        System.out.println(s2);
    }
}
