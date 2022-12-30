package InterfaceAssignment;

import Interface1.InterfaceAssignment;

public class Assignment3 implements InterfaceAssignment{
    public static void main(String[] args) {
        Assignment3 obj = new Assignment3();
        InterfaceAssignment.metho1();
        obj.method2();
        obj.method3();
    }
    public static void metho1() {
        System.out.println("In method1");
    }
    public void method2() {
        System.out.println("In method2");
    }
    public void method3() {
        System.out.println("In method3");
    }
}

