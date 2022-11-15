package polymorphism;

public class Overloading {
    void overloading()
    {
        System.out.println(10);
    }
    void overloading(int a)
    {
        System.out.println(20);
    }
    void overloading(int a,String s)
    {
        System.out.println(30);
    }
    void overloading(String s,int a)
    {
        System.out.println(40);
    }
    public static void main(String[] args) {
        Overloading over=new Overloading();
        over.overloading();
        over.overloading(5);
        over.overloading(6,"akhila");
        over.overloading("akhila",4);
    }
}
// Method overloading: writing 2 or more methods in the same class having same name but different parameters
//Compile-time polymorphism and early-binding polymorphism.
//Achieved by function overloading or operator overloading but java doesn't support operator overloading.
//Any method can be overloaded(even main method) and also constructor overloading is possible.