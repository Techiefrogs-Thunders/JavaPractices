package LinkedListassignment;
import java.util.*;
public class PP1 {
    Node head;
    public void addToTheLase(Node node){
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                temp.next=node;
            }
        }
    }
    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PP1 llist1 = new PP1();
        PP1 llist2 = new PP1();
 
        // Node head1 = new Node(5);
        llist1.addToTheLase(new Node(5));
        llist1.addToTheLase(new Node(10));
        llist1.addToTheLase(new Node(15));
 
        // Node head2 = new Node(2);
        llist2.addToTheLase(new Node(2));
        llist2.addToTheLase(new Node(3));
        llist2.addToTheLase(new Node(20));
 
        llist1.head = new Gfg().sortedMerge(llist1.head,
                                            llist2.head);
        System.out.println("Merged Linked List is:");
        llist1.printList();
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Gfg{
    Node sortedMerge(Node headA, Node headB)
    {
 
        /* a dummy first node to
           hang the result on */
        Node dummyNode = new Node(0);
 
        /* tail points to the
        last result node */
        Node tail = dummyNode;
        while (true) {
 
            /* if either list runs out,
            use the other list */
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
 
            /* Compare the data of the two
            lists whichever lists' data is
            smaller, append it into tail and
            advance the head to the next Node
            */
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            }
            else {
                tail.next = headB;
                headB = headB.next;
            }
 
            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }
}