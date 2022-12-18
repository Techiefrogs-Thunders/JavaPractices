package Collectionframe;
import java.util.*;
public class Book {
    public static void main(String[] args) {
        List<Books> b=new LinkedList<Books>();
        Books b1=new Books(1, "akhila", "Akhila", "AKHILA", 5);
        Books b2=new Books(2,"kakarla","Kakarla","KAKARLA",5);
        b.add(b1);
        b.add(b2);
        for(Books bs:b){
            System.out.println(bs.id+" "+bs.name+" "+bs.author+" "+bs.publisher+" "+bs.quantity);
        }
    }
}
class Books{
    int id;
    String name,author,publisher;
    int quantity;
    public Books(int id,String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}