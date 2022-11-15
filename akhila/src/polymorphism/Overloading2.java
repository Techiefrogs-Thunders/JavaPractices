package polymorphism;

public class Overloading2 {
    Overloading2()
    {
        System.out.println("Overloading() called");
    }
    Overloading2(int a,int b)
    {
        System.out.println("Overloading(a,b) called");
    }
    void overloading()
    {
        System.out.println("overloading() method called");
    }
    public static void main(String[] args) {
        Overloading2 over=new Overloading2();
        new Overloading2(3,5);
        over.overloading();
    }
}
