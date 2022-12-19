package LinkedListassignment;
import java.util.LinkedList;
import java.util.Iterator;
public class P3 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Akhila");
        ll.add("kakarla");
        ll.add("akhi");
        ll.add("kaka");
        System.out.println(ll);
        Iterator i=ll.listIterator(2);
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
