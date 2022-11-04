package basicPro;

import Loops.infinitLoop;

public class InstanceStaticVari {
   static int a;
    byte b=126;
    char c='C';
    long l1;

    public static void main(String[] args) {
        //long l1;
        InstanceStaticVari in=new InstanceStaticVari(); //  use for instance veriable 
        InstanceStaticVari st=new InstanceStaticVari();
        InstanceStaticVari.a=10;
        System.out.println(in.l1);
       // InstanceStaticVari.a=20;
        OuterClass.s="string name for outerclass";
        OuterClass.l=1234566;
        System.out.println(InstanceStaticVari.a); //static variable   className.variableName
        InstanceStaticVari.a=30;
        System.out.println(a); //static variable
        System.out.println(in.c);//instance variable    ObjectName.VariableName
        System.out.println(in.b); //instance variable 
        System.out.println(st.c);
        System.out.println(OuterClass.s);
        System.out.println(OuterClass.l);
        InstanceStaticVari.a=40;
        System.out.println(a);
        in.stringMethod(); // calling non-static method to the static by using class object
        in.method();
        OuterClass oc=new OuterClass();
       oc.OuterClass(234);
       oc.OuterClass(23);
       oc.OuterClass("defrgthy676u76u6");
    }
    public void stringMethod() {
        System.out.println(OuterClass.l);   
    }
    public void method() {
        System.out.println(c);   
    }
public void methodSecond() {
    System.out.println(c);   
}
}

class OuterClass {
   static long l;
   static String s;
    short b1;
public OuterClass(){
    System.out.println("construction");
}
public long OuterClass(long e){
    l=e;
    System.out.println(e);
    return l;
}
public byte OuterClass(byte b) {
     b1=b;
     return b;  
}
public String OuterClass(String s) {
     s=s;
    return s;  
}
}   
