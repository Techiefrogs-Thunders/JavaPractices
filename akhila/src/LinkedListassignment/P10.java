package LinkedListassignment;
import java.util.LinkedList;
public class P10 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("Three");
        ll.add("one");
        ll.add("two");
        System.out.println(ll);
        for(int i=0;i<ll.size();i++){
            System.out.println(i+" "+ll.get(i));
        }
        Object first=ll.getFirst();
        System.out.println(first);
        Object last=ll.getLast();
        System.out.println(last);

    }
}
