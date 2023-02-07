import java.util.*;
public class Hashtable2 {
    public static void main(String[] args) {
        Map<Integer,Book> hm=new Hashtable<Integer,Book>();
        Book b1=new Book(11,"qwj","akhila","hjwq",12);
        Book b2=new Book(22,"jhvwdjh","yuhqwgd","hwdv",12);
        hm.put(1,b1);
        hm.put(2,b2);
        for(Map.Entry<Integer, Book> entry:hm.entrySet()){    
            int key=entry.getKey();  
            Book b=entry.getValue();  
            System.out.println(key+" Details:");  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
        }    
    }
}
class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id,String name,String author,String publisher,int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
}