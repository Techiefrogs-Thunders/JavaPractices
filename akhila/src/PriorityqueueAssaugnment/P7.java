package PriorityqueueAssaugnment;
import java.util.*;
public class P7 {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<String>();
        q.add("aa");
        q.add("bb");
        q.add("cc");
        q.add("dd");
        q.add("ee");
        Queue<String> q1=new PriorityQueue<String>();
        q1.add("AA");
        q1.add("BB");
        q1.add("CC");
        q1.add("DD");
        q1.add("EE");
        for(String str:q){
            System.out.println(q1.contains(str));
        }
    }
}
