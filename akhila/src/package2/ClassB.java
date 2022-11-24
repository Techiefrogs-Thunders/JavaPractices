package package2;

import package1.ClassA;
import package1.subpack1.subClassA;
//import subpack1.*;
//import package1.*;
public class ClassB {
    public static void main(String[] args) {
        //package1.ClassA b=new package1.ClassA();
        ClassA b=new ClassA();
        subClassA a=new subClassA();
        a.displays();
        b.display();
    }
}
