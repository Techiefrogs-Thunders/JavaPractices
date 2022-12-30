package Collectionframe;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(1);
        hs.add("quwqu");
        System.out.println(hs);
        HashSet<Integer> hs1=new HashSet<Integer>();
        hs1.add(1);
        hs1.add(2);
        System.out.println(hs1);
        HashSet<Integer> hs2=new HashSet<Integer>();
        hs2=(HashSet)hs1.clone();
        System.out.println(hs2);
    }
}
