package Inheritanceassignment;

public class SubCounter extends Counter{
    public static void main(String[] args) {
        SubCounter sub=new SubCounter();
        sub.increment();
    }
}
class Counter{
    int i=3;
    void increment(){
        System.out.println("i="+i);
    }
}