package HashSetAssignment;
import java.util.*;
public class P9 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");
        System.out.println(set);
        List<String> l=new ArrayList<String>(set);
        System.out.println(l);
    }
}
