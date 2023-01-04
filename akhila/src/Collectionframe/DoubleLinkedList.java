
public class DoubleLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void addNewNode(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
            tail=n;
            head.prev=null;
            tail.next=null;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
            tail.next=null;
        }
    }
    public void ShowData(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        System.out.println("Nodes of doubly linked list");
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            
        
    }
    public static void main(String[] args) {
        DoubleLinkedList dll=new DoubleLinkedList();
        dll.addNewNode(1);
        dll.addNewNode(2);
        dll.addNewNode(3);
        dll.addNewNode(4);
        dll.ShowData();
    }
}
