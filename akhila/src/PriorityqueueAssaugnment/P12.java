package PriorityqueueAssaugnment;

import java.util.*;

public class P12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>(10,Collections.reverseOrder());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        Integer val=null;
        while((val=q.poll())!=null){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
