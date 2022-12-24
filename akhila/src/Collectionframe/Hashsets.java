package Collectionframe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;



public class Hashsets {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        set.add("dd");
        set.add("aa");
        Iterator<String> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        set.remove("aa");
        System.out.println(set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("aa");
        set1.add("bb");
        System.out.println(set1);
        //set.removeAll(set1);
        //System.out.println(set);
        //set.remove("aa");
        //System.out.println(set);
        //set.clear();
        //System.out.println();
        System.out.println(set.isEmpty());
        System.out.println(set.contains("aa"));
        System.out.println(set.size());
        //Spliterator<String> ii=set.spliterator();
        //while(ii.hasNext()){
        //    System.out.println(ii.next());
        //}
    }
}
//hashset doesn't allow duplicate values.

