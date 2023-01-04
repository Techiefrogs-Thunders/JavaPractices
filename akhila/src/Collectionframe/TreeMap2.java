import java.util.*;

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
public class TreeMap2{
    public static void main(String[] args) {
        Map<Integer,Book> m=new TreeMap<Integer,Book>();
        Book b1=new Book(1,"ewfwe","efwe","wefew",3232);
        Book b2=new Book(2,"ddw","efcred","wedv",565);
        Book b3=new Book(3,"hgdvhgw","jqwvd","jhqwdv",676);
        m.put(3,b1);
        m.put(1,b2);
        m.put(2,b3);
        for(Map.Entry<Integer,Book>entry:m.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key);
            System.out.println(b.name+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
