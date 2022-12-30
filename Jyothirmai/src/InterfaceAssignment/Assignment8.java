package InterfaceAssignment;

public class Assignment8 implements interfaceA {
    public static void main(String[] args) {
        Assignment8 obj1 = new Assignment8();
        obj1.method1();
    }
    public void method1() {
        interfaceA.innerclass obj = new interfaceA.innerclass();
        obj.method1();
        System.out.println("In main method");
    }
}
interface interfaceA{
    void method1();
    class innerclass implements interfaceA{
        public void method1() {
            System.out.println("In interface method");
        }
        
    }
}
