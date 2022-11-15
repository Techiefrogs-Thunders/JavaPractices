package polymorphism;

public class overloading1 extends CFG {
    public static void main(String[] args) {
        overloading1 ol=new overloading1();
        System.out.println(ol.multiply());
        System.out.println(ol.multiply(4));
        System.out.println(ol.multiply(3,4));
        
    }
}
class CFG
{
    int a=3;
    int b=5;
    int multiply()
    {
        return (a*b);
    }
    int multiply(int b)
    {
        return (a*b);
    }
    int multiply(int a,int b)
    {
        return (a*b);
    }
}
