package LinkedListassignment;
import java.util.LinkedList;
public class P24 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public boolean areIdentical(LinkedList lb){
        Node a=this.head,b=lb.head;
        while(a!=null&&b!=null){
            if(a.data!=b.data){
                return false;
                a=a.next;
                b=b.next;
            }
            else{
                return(a==null &&b==null);
            }
        }
    }
    void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll1=new LinkedList<Integer>();
        LinkedList<Integer> ll2=new LinkedList<Integer>();
        ll1.push(1);
        ll1.push(2);
        ll1.push(3);
        ll2.push(1);
        ll2.push(2);
        ll2.push(3);
        if(ll1.areIdentical(ll2)==true){
            System.out.println("They are identical ");
        }
        else{
            System.out.println("They are not identical");
        }
    }
}
