package InheritanceAssignments;
class Counter{
    int i;
    void increment()
    {
        System.out.println("i= " +i);
    }

}
class SubClass extends Counter{
    void increment1(){
        i=3;
        increment();
        
    }
}

public class Assignment7 {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.increment1();
    }
    
}

