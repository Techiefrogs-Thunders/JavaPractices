

import java.util.LinkedList;
import java.util.Iterator;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("aa");
        ll.add("bb");
        ll.add("cc");      
        System.out.println(ll);
        ll.addFirst("AA");
        ll.addLast("DD");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println( ll.contains("aa"));
        Object ll1=new LinkedList<String>();
        ll1=ll.clone();
        System.out.println(ll1);
        Iterator<String> i=ll.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        ll.clear();
        System.out.println(ll);
        
    }
}
