package Arraylistassignment;
import java.util.*;
public class P12 {
    public static void main(String[] args) {
        List<String> al=new ArrayList<String>();
        al.add("akhila");
        al.add("akhi");
        al.add("kakarla");
        al.add("grape");
        System.out.println(al);
        List<String> sub_al= al.subList(0,2);
        System.out.println(sub_al);
    }
}
