package LinkedListassignment;
import java.util.LinkedList;
import java.util.Iterator;
public class P2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        Iterator i=ll.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }
}
