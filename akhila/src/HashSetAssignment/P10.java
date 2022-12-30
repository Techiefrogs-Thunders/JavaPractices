package HashSetAssignment;
import java.util.*;
public class P10 {
    public static void main(String[] args) {
        HashSet<String> set1=new HashSet<String>();
        set1.add("aa");
        set1.add("bb");
        set1.add("cc");
        set1.add("dd");
        System.out.println(set1);
        HashSet<String> set2=new HashSet<String>();
        set2.add("aa");
        set2.add("bb");
        set2.add("cc");
        //set2.add("dd");
        System.out.println(set2);
        System.out.println(set1.equals(set2));
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
