package Arraylistassignment;
import java.util.ArrayList;
public class P13 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("four");
        al.add("five");
        System.out.println(al);
        al.set(2,"two");
        System.out.println(al);
        al.clear();
        System.out.println(al);
        System.out.println(al.isEmpty());
    }
}
