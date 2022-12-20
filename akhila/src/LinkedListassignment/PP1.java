package LinkedListassignment;

public class PP1 {
    public static class Node1{
        Node1 next;
        int data;
    }
    public static class Node2{
        int data;
        Node2 next;
    }
    public static class Node3{
        Node3 next;
        int data;
    }
    public static void main(String[] args) {
        Node1 nn11=new Node1();
        Node1 nn12=new Node1();
        Node1 nn13=new Node1();
        nn11.data=1;
        nn12.data=2;
        nn13.data=4;
        Node2 nn1=new Node2();
        Node2 nn2=new Node2();
        Node2 nn3=new Node2();
        nn1.data=1;
        nn2.data=3;
        nn3.data=4;
        Node3 n31=new Node3();
        Node3 n32=new Node3();
        Node3 n33=new Node3();
        Node3 n34=new Node3();
        Node3 n35=new Node3();
        Node3 n36=new Node3();
        nn11.next=nn12;
        nn12.next=nn13;
        nn13.next=null;

        nn1.next=nn2;
        nn2.next=nn3;
        nn3.next=null;

        n31.next=n32;
        n32.next=n33;
        n33.next=n34;
        n34.next=n35;
        n35.next=n36;
        n36.next=null;
        Node1 cn1=nn11;
        Node2 cn2=nn1;
        Node3 cn3=n31;
        while(cn3.next!=null){
            if(cn1.data>cn2.data){
                cn3.data=cn2.data;
                cn2=cn2.next;
                cn3=cn3.next;
            }
            else if(cn1.data<cn2.data){
                cn3.data=cn1.data;
                cn1=cn1.next;
                cn3=cn3.next;
            }
        }
        Node3 cn=n31;
        System.out.println("The merged list is ");
        for(int i=1;i<=6;i++){
            System.out.println(cn.data+" ");
            cn=cn.next;
        }
    }
}
