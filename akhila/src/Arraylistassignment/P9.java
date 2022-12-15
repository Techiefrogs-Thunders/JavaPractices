package Arraylistassignment;
import java.util.*;
public class P9 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(3);
        al.add(1);
        al.add(8);
        al.add(2);
        al.add(4);
        System.out.println(al);
        System.out.println("Before Shuffling");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        Collections.shuffle(al);
        System.out.println("After shuffle");
        itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
