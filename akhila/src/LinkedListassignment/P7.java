package LinkedListassignment;
import java.util.LinkedList;
public class P7 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        ll.offerFirst(5);
        System.out.println(ll);
        ll.offerLast(6);
        System.out.println(ll);
        ll.add(5,7);
        System.out.println(ll);
    }
}