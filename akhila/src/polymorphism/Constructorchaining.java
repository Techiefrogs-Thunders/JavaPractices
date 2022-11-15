package polymorphism;

public class Constructorchaining {
    public static void main(String[] args) {
        new Parent();
        new Child();
    }
}
class Parent{
    Parent()
    {
        this(5);
        System.out.println("Parent() constructor");
        
    }
    Parent(int a)
    {
        this(5,6);
        System.out.println(a);
    }
    Parent(int a,int b)
    {
        System.out.println(a+" "+b);
    }
}
class Child extends Parent{
    Child()
    {
        super(5);
        System.out.println("Default constructor");
    }
}