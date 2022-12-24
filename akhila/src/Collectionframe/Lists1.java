package Collectionframe;
import java.util.*;
//to print list
public class Lists1 {
    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        for(int i:ll){
            System.out.println(i);
        }
    }
}
//converting array to list
class List2{
    public static void main(String[] args) {
        String[] arr={"aa","bb","cc"};
        System.out.println(arr);
        List<String> ll=new LinkedList<String>();
        for(String e:arr){
            ll.add(e);
        }
        System.out.println(ll);
    }
}
//converting list to array
class List3{
    public static void main(String[] args) {
        List<String> ll=new LinkedList<String>();
        ll.add("aa");
        ll.add("bb");
        ll.add("cc");
        ll.add("dd");
        System.out.println(ll);
        String[] arr=ll.toArray(new String[ll.size()]);
        System.out.println(arr);
    }
}
class List4{
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<Integer>();
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.set(0,0);
        System.out.println(ll);
        System.out.println(ll.get(1));
        Collections.sort(ll);
        System.out.println(ll);
        ListIterator<Integer> i=ll.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        while(i.hasPrevious()){
            System.out.println(i.previousIndex()+" "+i.previous());
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
class List5{
    public static void main(String[] args) {
        List<Books> ll=new ArrayList<Books>();
        Books b1=new Books(1,"akhila","Akhila","AKHILA",500);
        Books b2=new Books(2,"kakarla","Kakarla","KAKARLA",400);
        Books b3=new Books(3,"akhi","Akhi","AKHI",300);
        ll.add(b1);
        ll.add(b2);
        ll.add(b3);
        for(Books b:ll){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
