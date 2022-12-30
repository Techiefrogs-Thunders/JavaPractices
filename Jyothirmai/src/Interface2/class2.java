package Interface2;

import Interface1.Interface7;
import InterfaceAssignment.Assignment7;

public class class2 extends Interface7{
    Assignment7 getinterfaceA(){
        return (Assignment7) this.new interfaceA();
    }
    public static void main(String[] args) {
       class2 obj = new class2();
       System.out.println(obj.getinterfaceA().method1()); 
    }
}
