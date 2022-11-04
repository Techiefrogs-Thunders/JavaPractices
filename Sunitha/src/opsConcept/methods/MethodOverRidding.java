package opsConcept.methods;

import java.lang.reflect.Constructor;

public class MethodOverRidding { // method overriding meand have same method name and variable name with no arguments
    public static void main(String[] args) {
        GrandChild gc=new GrandChild();
        ChildMethod cm=new ChildMethod();
        cm.getName();
        
      //gc.getName();
    }
}
class ParentMethod {

    int a=10;
    String b="hero";
    char c='A';
    long l=1234567890;
    ParentMethod(){
        System.out.println("parent constructor");   
    }
    public void getName(){
        System.out.println(c+"--------"+b);
        System.out.println(a+"---no---"+l);
        System.out.println(this.c); //without giving this keyword also we can call variable and also by giving this keyword as well
        System.out.println(c);
        System.out.println(a); 
    }
}
class ChildMethod extends ParentMethod{
    int a=50;
    String b="Child Star hero";
    char c='B';
    long l=87654322;
    ChildMethod(){// without giving super keyword it autmatically call super keyword internally or we can give super keyword as well
        //super();
        this(98989898);//by using th9is keyword we are providing values for int a constructor
        System.out.println("child constructor");
        //super.getName(); //by giving calling super keyword in constructor first call the methods and then again call the construction
    }
    ChildMethod(int a){
        System.out.println("welcome to no: -"+a);
    }
    public void getName() {
        System.out.println(c+"--------"+b);
        System.out.println(a+"---no---"+l);
        System.out.println(c);//calling this class variable directly
        System.out.println(a); //calling this class variable directly
        System.out.println(super.c);//by using super keyword calling parent variable to child method
        System.out.println(super.a);//by using super keyword calling parent variable to child method
        System.out.println(super.l); //by using super keyword calling parent variable to child method
        super.getName(); //by using super keyword calling parent method to the child method  
    }
}
class GrandChild extends ChildMethod{
    int a=70;
    String b="Grand Child Star hero";
    char c='C';
    long l=654322;
    GrandChild(){
        this(222.99);
    }
    GrandChild(double d){
        System.out.println("calling double value:-"+ d);
    }
    public void getName() {
        System.out.println(c+"--------"+b);
        System.out.println(a+"---no---"+l);
        System.out.println(l);
        System.out.println(super.l);
        super.getName();
    }
}
