package pack1;

interface Interface {
    int i = 30;
    void display();
}
public class Test implements Interface, Interface2{
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
        obj.myMethod();
        System.out.println(Interface.i+"  "+Interface2.i);
    }

    public void display() {
        System.out.println("In display method");
        
    }
    public void myMethod() {
        System.out.println("In myMethod");
    }
}
interface Interface2{
    int k = 40;
    int i = 20;
    void myMethod();
    void display();
}
