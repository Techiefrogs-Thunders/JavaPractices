package Stackassignment;
import java.util.Stack;
public class P1 {
    Stack<Integer> s;
    Integer minEle;
    P1(){
        s=new Stack<Integer>();
    }
    void getMin(){
        if (s.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Minimum Element in the "
                               + " stack is: " + minEle);
        }
    }
    void peek()
    {
        if (s.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }
        Integer t = s.peek(); 
        System.out.print("Top Most Element is: ");
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }
    void pop()
    {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
 
        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();
 
        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        }
 
        else
            System.out.println(t);
    }
    void push(Integer x)
    {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
 
        // If new number is less than original minEle
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        }
 
        else
            s.push(x);
 
        System.out.println("Number Inserted: " + x);
    }

    public static void main(String[] args) {
        P1 p1=new P1();
        p1.push(3);
        p1.push(5);
        p1.push(2);
        p1.push(1);
        p1.getMin();
        p1.peek();
        p1.pop();
        p1.getMin();
        p1.peek();
        p1.pop();
    }
}
