package LinkedListassignment;
import java.util.LinkedList;
import java.util.Iterator;
public class P4 {
   public static void main(String[] args) {
    LinkedList<String> ll=new LinkedList<String>();
    ll.add("one");
    ll.add("two");
    ll.add("three");
    ll.add("four");
    Iterator i=ll.descendingIterator();
    while(i.hasNext()){
        System.out.println(i.next()+" ");
    }
   } 
}
