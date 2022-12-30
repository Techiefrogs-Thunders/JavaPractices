package HashSetAssignment;
import java.util.*;
public class P7 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        System.out.println(hs);
        Integer[] arr=new Integer[hs.size()];
        hs.toArray(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
