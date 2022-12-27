package PriorityqueueAssaugnment;
import java.util.*;
public class P13 {
    public static void main(String[] args) {
        int[] arr={2,7,1,8,9};
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(Integer i: arr){
            q.add(i);
        }
        while(q.size()>1){
            q.add(q.poll()-q.poll());
        }
        System.out.println(q.peek());
    }
}
