package LinkedListassignment;
import java.util.LinkedList;
public class P22 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("One");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        System.out.println(ll);
        if(ll.contains("five")){
            System.out.println("One is present");
        }
        else{
            System.out.println("One is not present");
        }
    }
}
