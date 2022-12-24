package Collectionframe;
import java.util.*;
public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<String> lh=new LinkedHashSet<String>();
        lh.add("ravi");
        lh.add("vijay");
        lh.add("ravi");
        lh.add("ajay");
        System.out.println(lh);
        Iterator<String> i=lh.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
