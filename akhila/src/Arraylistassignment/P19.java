package Arraylistassignment;
import java.util.*;
public class P19 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Green");
        al.add("Red");
        al.add("Black");
        System.out.println(al);
        al.ensureCapacity(6);
        al.add("white");
        al.add("Pink");
        al.add("Yellow");
        System.out.println(al);
    }
}
