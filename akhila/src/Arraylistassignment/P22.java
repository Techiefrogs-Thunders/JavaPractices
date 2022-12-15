package Arraylistassignment;
import java.util.*;
public class P22 {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("Apple");
        al1.add("Orange");
        al1.add("Grape");
        System.out.println(al1);
        int n=al1.size();
        for(int i=0;i<n;i++){
            System.out.print(al1.get(i)+" ");
        }
        System.out.println();
    }
}
