package Collectionframe;
import java.util.*;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("aa");
        ll.add("bb");
        ll.add("cc");      
        System.out.println(ll);
        LinkedList<String> ll1=new LinkedList<String>();
        ll1.add("aa");
        ll1.add("bb");
        ll1.add("cc");      
        System.out.println(ll1);
        ll.addAll(ll1);
        System.out.println(ll);
        ll.removeLastOccurrence("aa");
        //ll.removeFirstOccurrence("aa");
        System.out.println(ll);
        ll.remove(0);
        System.out.println(ll);
        //ll.removeAll(ll1);
        //System.out.println(ll);
        LinkedList<Integer> ll2=new LinkedList<Integer>();
        ll2.add(4);
        ll2.add(7);
        ll2.add(5);
        ll2.add(8);
        Iterator ii=ll2.descendingIterator();
        while(ii.hasNext()){
            System.out.print(ii.next()+" ");
        }
        System.out.println();
    }
}
