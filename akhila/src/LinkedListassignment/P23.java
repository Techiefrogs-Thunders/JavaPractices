package LinkedListassignment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedList;
public class P23 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        List<Integer> ll1=new ArrayList<Integer>(ll);
        for(Object i:ll1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
