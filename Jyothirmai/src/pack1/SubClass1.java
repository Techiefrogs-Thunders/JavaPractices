package pack1;

public class SubClass1 extends ParentClass {
    int b = 30;


    void AllDisplay(){
        System.out.println("in child alldisplay method");
    }
    SubClass1(){
       // super();
       System.out.println("in my own constructor");
    }
    public static void main(String[] args) {
        SubClass1 obj1 = new SubClass1();
        obj1.AllDisplay();
        obj1.a = 40;
        obj1.b = 50;
    }
}
