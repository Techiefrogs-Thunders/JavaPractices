package Arraylistassignment;
import java.util.*;
public class P16 {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("One");
        al1.add("Two");
        al1.add("Three");
        //System.out.println(al1);
        ArrayList<String> al2=new ArrayList<String>(3);
        al2.add("apple");
        al2.add("greebn");
        al2.add("pineapple");
        System.out.println(al1);
        System.out.println(al2);
        Collections.copy(al1,al2);
        System.out.println(al1);
        System.out.println(al2);
    }
}
