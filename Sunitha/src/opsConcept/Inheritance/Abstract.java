package opsConcept.Inheritance;

public class Abstract {
 public static void main(String[] args) {
  // IPhone ip=new IPhone();
    Android ad=new Android();
    ad.getPrice();
    ad.payPrice();
 }   
}

abstract class Technology{
    int no=9999;
    long l=444444;
    double d=22.22;
    boolean calling;
    abstract void getPrice();
}
abstract class IPhone  extends Technology{ 
    final String name="java";
    //name="class";
    IPhone(){
        System.out.println("Iphone constructor: "+d);
    }
    IPhone(int a){
System.out.println(a + d);
    }
//for abstract class we cant create a an object to use this class again create extended classs(no abstract) for this and call methods by creating object
void getPrice(){
    System.out.println("Iphone getPrice " + name+" "+ l);
}
void payPrice(boolean calling){
    System.out.println("Iphone getPrice "+ name+" "+no);
}
}

class Android extends IPhone{
    String name="java1";
    Android(){
        super(2888888);
        System.out.println("Android constructor");
    }
void  getPrice(){
    System.out.println(name);
    super.getPrice();
}
void payPrice(){
    super.payPrice(true);
    System.out.println(calling);
}
}
