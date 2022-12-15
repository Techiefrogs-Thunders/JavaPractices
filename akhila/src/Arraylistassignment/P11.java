package Arraylistassignment;
import java.util.*;
public class P11 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<String>();
        str.add("apple");
        str.add("banana");
        str.add("grape");
        str.add("orange");
        System.out.println(str);
        Collections.swap(str,1,2);
        System.out.println(str);
    }
}
