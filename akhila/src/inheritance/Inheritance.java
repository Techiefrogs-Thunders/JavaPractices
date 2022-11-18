package inheritance;

public class Inheritance extends Subclass{
    void meth1()
    {
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        Inheritance i=new Inheritance();
        //we can hold both parent and child clss method by using child class reference 
        i.meth2();
        i.meth1(5);
        i.meth1(3,5);
        i.meth1();
        Subclass s=new Subclass();
        s.meth2();
        //s.meth1();//we can only hold parent clss obj with parent clss reference
        s.meth1(4);
        s.meth1(3,7);
        Subclass c=new Inheritance();
        //c.meth1();//we can only hold parent class object with parent clss reference
        c.meth1(5);
        c.meth1(6,8);
        c.meth2();
        //Inheritance d=new Subclass();// we cannot hold parent clss object with child class reference
    }
}
class Subclass
{
    int a=5;
    int b=6;
    void meth1(int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    void meth1(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    void meth2()
    {
        System.out.println("This is parent class");
    }
}