package PriorityqueueAssaugnment;
import java.util.*;
public class P4 {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<String>();
        q.add("aa");
        q.add("bb");
        q.add("cc");
        q.add("dd");
        System.out.println(q);
        q.offer("ee");
        System.out.println(q);
        System.out.println(q.size());
    }
}
