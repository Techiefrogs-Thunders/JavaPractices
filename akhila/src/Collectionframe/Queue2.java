package Collectionframe;

import java.util.Iterator;
import java.util.PriorityQueue;
public class Queue2 {
    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<String>();
        q.add("aa");
        q.add("bb");
        q.add("cc");
        q.add("dd");
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());
        Iterator i=q.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
    }
}
//Queue: availble in util package and does extend the collection interface
//FIFO( First In First Out) manner.
//ordered list of objects,where insertion of elements occurs at the end of the list and removal of elements occur at the beginning of the list
//q.element(): displays first element
//q.peek(): used to retrieve but does not remove,the head of this queue.
//remove(): removes first element
//poll(): removes first element
//
