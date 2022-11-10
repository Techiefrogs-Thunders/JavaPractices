package Inheritanceassignment;

public class ClassB extends ClassA{
    int k=4;
    ClassB() {
        System.out.println("This is child class");
        //TODO Auto-generated constructor stub
    }
    void show()
    {
        System.out.println("k="+k);
    }

    public static void main(String[] args) {
        ClassA a=new ClassA();
        a.show();
        ClassB b=new ClassB();
        b.show();
    }
}
class ClassA{
    int i=4;
    int j=5;
    ClassA()
    {
        System.out.println("This is super class");
    }
    void show()
    {
        System.out.println("i="+i+"  j="+j);
    }
}
