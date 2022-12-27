package PriorityqueueAssaugnment;
import java.util.*;
public class P3 {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<String>();
        q.add("aa");
        q.add("bb");
        q.add("cc");
        q.add("dd");
        Queue<String> q1=new PriorityQueue<String>();
        q1.addAll(q);
        System.out.println(q1);
        q.clear();
        System.out.println(q);
        
    }
}
