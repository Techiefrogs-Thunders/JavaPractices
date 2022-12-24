package LinkedListassignment;
import java.util.LinkedList;
public class P17 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<Integer>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        System.out.println(ll1);
        LinkedList<Integer> ll2=new LinkedList<Integer>();
        ll2.add(5);
        ll2.add(6);
        ll2.add(7);
        ll2.add(8);
        System.out.println(ll2);
        LinkedList<Integer> ll3=new LinkedList<Integer>();
        ll3.addAll(ll1);
        ll3.addAll(ll2);
        System.out.println(ll3);
        

    }
}
