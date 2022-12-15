package Arraylistassignment;

import java.util.ArrayList;

public class P3 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("red");
        al.add("white");
        al.add("green");
        al.add("orange");
        System.out.println(al);
        al.add(0,"black");
        System.out.println(al);
        System.out.println(al.get(1));
        al.set(3,"red");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        boolean ans=al.contains("blue");
        if(ans){
            System.out.println("contains");
        }
        else{
            System.out.println("not contains");
        }
    }
}
