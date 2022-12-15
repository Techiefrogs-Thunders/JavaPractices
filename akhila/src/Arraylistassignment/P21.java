package Arraylistassignment;
import java.util.*;
public class P21 {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("four");
        al2.add("five");
        al2.add("six");
        al1.addAll(al2);
        System.out.println(al1);
    }
}
