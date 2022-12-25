package InheritanceAssignments;

public class Assignment1 {
    public static void main(String[] args) {
        Parent par = new Parent();
        Child ch = new Child();
        Parent par1 = new Child();
        par.parent();
        ch.child();
        par1.parent();
    }
}
class Parent{
    void parent(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    void child(){
        System.out.println("This is child class");
    }
}
