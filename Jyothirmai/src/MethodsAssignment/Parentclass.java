package MethodsAssignment;

public class Parentclass {
    public static void main(String[] args) {
        Parent obj = new Parent();
        Child Obj1 = new Parent();
        Child obj2 = new Child(); 
        obj.parent();
        Obj1.child();
        obj2.child();

        
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
