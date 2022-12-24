package LinkedListassignment;

public class PP7 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    //to add new node
    public void pushNode(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }
    //displaying the elements in the list
    public void printNode()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null"
                         + "\n");
    }
    //finding length of the list
    public int getLen()
    {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }
    //printing the middle element
    public void printMiddle()
    {
        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["
                             + temp.data + "]");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PP7 pp7=new PP7();
        for(int i=5;i>=1;i--){
            pp7.pushNode(i);
            pp7.printNode();
            pp7.printMiddle();
        }
    }
}
