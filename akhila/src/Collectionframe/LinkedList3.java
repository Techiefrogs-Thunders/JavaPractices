package Collectionframe;

public class LinkedList3 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public Node head=null;
        public Node tail=null;
        public void addNode(int data){
            Node newNode= new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;

            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        public void display(){
            Node current=head;
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of singly linked list");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            LinkedList3 ll3=new LinkedList3();
            ll3.addNode(1);
            ll3.addNode(2);
            ll3.addNode(3);
            ll3.addNode(4);  
            ll3.display();          
        }
    
}

