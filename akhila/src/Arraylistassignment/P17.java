package Arraylistassignment;

import java.util.ArrayList;

public class P17 {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("One");
        al1.add("Two");
        al1.add("Three");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("one");
        al2.add("two");
        al2.add("three");
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(al1.equals(al2));
    }
}
