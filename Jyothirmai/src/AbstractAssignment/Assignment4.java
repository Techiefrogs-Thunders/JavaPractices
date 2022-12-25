package AbstractAssignment;

public class Assignment4 {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.a_method();
        obj.display();
        
    }
}

abstract class Mainclass{
    abstract void a_method();
    void display(){
        System.out.println("This is a normal method of abstract class");
    }
}
class Subclass extends Mainclass{
    void a_method(){
        System.out.println("This is abstract method");
    }
}
