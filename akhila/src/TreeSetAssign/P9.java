package TreeSetAssign;
import java.util.*;
public class P9 {
    public static void main(String[] args) {
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     
   // Add numbers in the tree
   tree_num.add(1);
   tree_num.add(2);
   tree_num.add(3);
   tree_num.add(5);
   tree_num.add(6);
   tree_num.add(7);
   tree_num.add(8);
   tree_num.add(9);
   tree_num.add(10);
   //treeheadset = (TreeSet)tree_num.headSet(7); 
   //treeheadset = (TreeSet)tree_num.tailSet(7);  
   // create an iterator
   //System.out.println(tree_num.floor(7));
   //Iterator iterator;
   //iterator = treeheadset.iterator();
     
   //Displaying the tree set data
   //System.out.println("Tree set data: ");     
   //while (iterator.hasNext()){
   //System.out.println(iterator.next() + " ");

    //}
    //System.out.println(tree_num.floor(7));
    System.out.println(tree_num.higher(5));
    //System.out.println(tree_num.lower(3));
}
}
