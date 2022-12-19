package LinkedListassignment;
import java.util.LinkedList;
public class P18 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        Object ll1=new LinkedList<Integer>();
        ll1=ll.clone();
        System.out.println(ll1);
    }
}
