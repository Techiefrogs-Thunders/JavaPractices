package AbstractAssignment;

abstract class Parent {

    abstract void message();
}
class Child1 extends Parent{
    void message(){
        System.out.println("This is first subclass");
    }
}
class Child2 extends Child1{
    void message(){
        System.out.println("This is second subclass");
    }
}
public class Grandparent extends Child2{
    public static void main(String[] args) {
        Child2 obj = new Child2();
        Child1 obj1 = new Child1();
        obj1.message();
        obj.message();
    }
}