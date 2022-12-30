package HashSetAssignment;
import java.util.*;
public class P15 {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        System.out.println(s1);
        Set<Integer> s2=new HashSet<>();
        s2.add(2);
        s2.add(3);
        System.out.println(s2);
        s2.retainAll(s1);
        System.out.println(s2);
    }
}
