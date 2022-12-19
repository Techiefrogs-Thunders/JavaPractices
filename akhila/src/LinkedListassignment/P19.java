package LinkedListassignment;
import java.util.LinkedList;
public class P19 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        System.out.println(ll.peekLast());
        //System.out.println(ll.peekFirst());
        //System.out.println("Removed element: "+ll.pop());
        System.out.println(ll);
    }
}
