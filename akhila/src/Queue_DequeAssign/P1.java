package Queue_DequeAssign;
import java.util.*;
public class P1 {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<Integer>();
        deque.add(5);
        //System.out.println("After push front deque will be "+deque);
        deque.push(10);
        //System.out.println("After push front deque will be "+deque);
        deque.addLast(6);
        //System.out.println("After push front deque will be "+deque);
        System.out.println(deque.getFirst());
        deque.removeLast();
        //System.out.println("After pop back deque will be "+deque);
    }
}
