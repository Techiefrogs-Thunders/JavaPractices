package Methods;

class A{
    
    static void print(){
        System.out.println("Parent");
    }
}

class B extends A{
    
    static void print(){
        System.out.println("Child");
    }
}
public class Methods8 {
    public static void main(String[] args) {
        A a = new A();
        A.print();
        B b = new B();
        B.print();
        A obj = new B();
        obj.print();
            
    }
}