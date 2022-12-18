package Collectionframe;
import java.util.Stack;
import java.util.*;
public class StackExample {
     public static void main(String[] args) {
     Stack<Integer> stk=new Stack<>();
     //Stack stk=new Stack();
     boolean res=stk.empty();
     System.out.println("Is the stack empty "+res);
     stk.push(78);
     stk.push(21);
     stk.push(23);
     stk.push(98);
     int loc=stk.search(23);
     System.out.println(stk.size());
     System.out.println("location "+loc);
     System.out.println("Elements in stack "+stk);
     res=stk.empty();
     System.out.println("Is the stack empty "+res);
     /* 
     while(!stk.empty()){
          System.out.println(stk.peek());
          stk.pop();
     }
     */
     Iterator i=stk.iterator();
     while(i.hasNext()){
          Object values=i.next();
          System.out.print(values+" ");
     }
     System.out.println();
     stk.forEach(n->
     {
          System.out.println(n);
     });
     /* 
     ListIterator<Integer> li=stk.listIterator(stk.size());
     while(ListIterator.hasPrevious()){
          Object avg=ListIterator.previous();
          System.out.println();
     }
     */
     }
}
