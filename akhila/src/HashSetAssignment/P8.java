package HashSetAssignment;
import java.util.*;
public class P8 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");
        System.out.println(set);
        Set<String> ts=new TreeSet<>(set);
        System.out.println(ts);
    }
}
