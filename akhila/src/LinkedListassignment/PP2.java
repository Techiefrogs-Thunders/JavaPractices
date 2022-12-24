package LinkedListassignment;
import java.util.*;
//import java.io.*;
public class PP2 {
    Node head; 
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    void removeDuplicates()
    {
        
        Node curr = head;
 
        
        while (curr != null) {
            Node temp = curr;
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            
            curr.next = temp;
            curr = curr.next;
        }
    }
 
   
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
    }
 
   
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
 
    
    public static void main(String args[])
    {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
        PP2 pp2=new PP2();
         
        System.out.println(
            "List before removal of duplicates");
        pp2.printList();
 
        pp2.removeDuplicates();
 
        System.out.println(
            "List after removal of elements");
        pp2.printList();
    }
}
