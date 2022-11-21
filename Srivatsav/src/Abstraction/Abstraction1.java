package Abstraction;

abstract class Parent{

    public Parent(){
        System.out.println("This is abstract class Parent()");
    }
    public abstract void message();
}

class Daughter extends Parent{
    @Override
    public void message() {
        System.out.println("This is a second sub class Daughter");
    }
}

class Son extends Parent{
    @Override
    public void message() {
        System.out.println("This is a first sub class Son");
    }
}

public class Abstraction1{
    
    public static void main(String[] args) {
        Son son=new Son();
        son.message();
        System.out.println("  ");
        Daughter daughter=new Daughter();
        daughter.message();
    }
}
