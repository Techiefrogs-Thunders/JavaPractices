package assignmentsInheritance;

public class Counterclass {
    public static void main(String[] args) {
        SubCounter sc=new SubCounter();
        sc.increment();
    }
    
}

class Counter{
    int i=3;
    void increment(){
System.out.println("counter method: "+ i);
    }
}
class SubCounter extends Counter{
    void increment(){
System.out.println("Sub counter method: "+ i);
    }
}