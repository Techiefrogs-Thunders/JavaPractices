package Arraylistassignment;
import java.util.*;
public class P18 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("");
        al.add("One");
        al.add("Two");
        al.add("");
        al.add("Three");
        al.add("");

        System.out.println(al);
        al.trimToSize();
        System.out.println(al);
    }
}
