package PriorityqueueAssaugnment;
import java.util.*;
public class P9 {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<String>();
        q.add("aa");
        q.add("bb");
        q.add("cc");
        q.add("dd");
        System.out.println(q);
        //ArrayList<String> arr=new ArrayList<String>(q);
        //System.out.println(arr);
        String str=q.toString();
        System.out.println(str);

    }
}
