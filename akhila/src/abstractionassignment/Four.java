package abstractionassignment;
abstract class SuperClass{
    SuperClass(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void meth2()
    {
        System.out.println("This is a normal method of abstract class");
    }
    
}
class SubClass extends SuperClass
{
    public void a_method()
    {
        System.out.println("This is abstract method");
    }
}
public class Four {
    public static void main(String[] args) {
        SubClass sub=new SubClass();
    sub.a_method();
    sub.meth2();
}
    }
