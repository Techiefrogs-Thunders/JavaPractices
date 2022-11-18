package Abstraction;

abstract class Person {
    public Person() {
        System.out.println("This is an abstract class Person()");
    }
    public abstract void a_Method();
    public void display(){
        System.out.println("This is a normal method of abstract class Person");
    }
}

public class Abstraction4 extends Person{
    @Override
    public void a_Method() {
        System.out.println("This is abstract method implementation in Sub class Abstraction4");
    }
    public static void main(String[] args) {
        Abstraction4 abs=new Abstraction4();
        abs.a_Method();
        abs.display();
    }
}
