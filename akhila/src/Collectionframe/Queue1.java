package Collectionframe;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Books> q=new PriorityQueue<Books>();
        Books b1=new Books(1,"akhila","Akhila","AKHILA",20);
        Books b2=new Books(2,"kakarla","Kakarla","KAKARLA",20);
        Books b3=new Books(3,"akhi","Akhi","AKHI",20);
        q.add(b1);
        q.add(b2);
        q.add(b3);
        for(Books b:q){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        q.remove();
        for(Books b:q){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
class Books{
    int id;
    String name,author,publisher;
    int quantity;
    public Books(int id,String name,String author,String publisher,int quantity){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.id=id;
        this.quantity=quantity;
    }
    public int compareTo(Books b){
        if(id>b.id){
            return 1;
        }
        else if(id<b.id){
            return -1;
        }
        else{
            return 0;
        }
    }
}