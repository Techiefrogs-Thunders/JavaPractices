package MethodsAssignment;

public class Parentclass {
    public static void main(String[] args) {
        new Parent();
        new Parent();
        new Child(); 
        Parent.parent();
        Child.child();
        Child.child();

        
    }
}
class Parent extends Child {
    static void parent(){
        System.out.println("In Parent Class");
    }
}
class Child{
    static void child(){
        System.out.println("In Child Class");
    }
}
