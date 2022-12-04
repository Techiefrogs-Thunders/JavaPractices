package arraysassignment;

import java.util.ArrayList;
import java.util.*;
public class Fortythree {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>(4);
        a.add(2);
        a.add(9);
        a.add(4);
        a.add(5);
        Boolean found=a.contains(7);
        System.out.println(found);
    }
}
