package LinkedListassignment;
//import java.util.*;
public class PP4 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node reverse(Node node){
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }
    void printList(Node node){
        while(node!=null){
            System.out.println(node.data+" ");
            node=node.next;
        }
    }
    public static void main(String[] args) {
        
        PP4 pp4=new PP4();
        pp4.head=new Node(2);
        pp4.head.next=new Node(2);
        pp4.head.next.next=new Node(3);
        pp4.head.next.next.next=new Node(4);
        
    }
}
