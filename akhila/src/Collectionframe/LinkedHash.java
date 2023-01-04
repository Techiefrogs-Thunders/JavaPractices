
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
//LinkedHashSet clas is a Hashtable and LinkedList implementation of the Set interface
//inherits the HashSet class and implements the Set interface.
//contains only unique elements
//provides all optionalset operatns and permits null elements
//non-synchronized
//maintains insertion order
