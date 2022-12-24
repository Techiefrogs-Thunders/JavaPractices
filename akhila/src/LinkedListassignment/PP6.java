package LinkedListassignment;

public class PP6 {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
        
        public static void main(String[] args) {
            PP6 pp6=new PP6();
            Node head1,head2;
            head1=new Node(10);
            head2=new Node(3);
            Node newNode=new Node(6);
            head2.next=newNode;
            newNode=new Node(9);
            head2.next.next=newNode;
            newNode=new Node(15);
            head1.next=newNode;
            head2.next.next=newNode;
            newNode=new Node(30);
            head1.next.next=newNode;
            head1.next.next.next=null;
            Node intersectionPoint=pp6.getIntersectionNode(head1,head2);
            if(intersectionPoint==null){
                System.out.println("No Intersection Point\n");
            }
            else{
                System.out.println("Intersection Point: "+intersectionPoint.data);
            }
        }
    }

    public Node getIntersectionNode(Node head1, Node head2) {
        while(head2!=null){
            Node temp=head1;
            while(temp!=null){
                if(temp==head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
}
