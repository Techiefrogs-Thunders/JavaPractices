package methodsassignment;
class A{
    static void meth1()
    {
        System.out.println("Parent");
    }
}
class B extends  A{
    static void meth1()
    {
        System.out.println("Child");
    }
}
public class C {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        A obj=new B();
        a.meth1();
        b.meth1();
        obj.meth1();
    }
    
}
