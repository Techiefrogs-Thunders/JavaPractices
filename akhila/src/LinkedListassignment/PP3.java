package LinkedListassignment;

import java.util.List;

public class PP3 {
    public static boolean hasCycle(List head){
         List fast=head;
         List slow=head;
         while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
         }
         return false;
    }
}
