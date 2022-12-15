package Arraylistassignment;
import java.util.*;
public class P8 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(3);
        al.add(1);
        al.add(4);
        al.add(2);
    System.out.println(al);
    Collections.sort(al);
    System.out.println(al);
    }
}
