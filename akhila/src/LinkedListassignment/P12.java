package LinkedListassignment;
import java.util.LinkedList;
public class P12 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(3);
        ll.add(7);
        ll.add(6);
        ll.add(4);
        System.out.println(ll);
        //ll.remove(2);
        //ll.removeFirst();
        //System.out.println(ll);
        //ll.removeLast();
        //System.out.println(ll);
        ll.removeAll(ll);
        System.out.println(ll);
        if(ll.size()==0){
            System.out.println("we removed all");
        }
        
    }
}
