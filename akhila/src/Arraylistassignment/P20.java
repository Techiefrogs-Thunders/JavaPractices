package Arraylistassignment;
import java.util.*;
public class P20 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("One");
        al.add("two");
        al.add("three");
        System.out.println(al);
        ArrayList al1=(ArrayList)al.clone();
        System.out.println(al1);
    }
}
