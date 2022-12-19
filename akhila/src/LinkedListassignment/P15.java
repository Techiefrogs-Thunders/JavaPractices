package LinkedListassignment;
import java.util.Collections;
import java.util.LinkedList;
public class P15 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(4);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        System.out.println(ll);
        //Collections.swap(ll,0,3);
        Collections.shuffle(ll);
        System.out.println(ll);
    }
}
