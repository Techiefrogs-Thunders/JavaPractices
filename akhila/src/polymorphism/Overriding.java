package polymorphism;

public class Overriding extends Superclass{
    static int c=9;
    static int d=5;
    Overriding()
    {
        super();//this should be the first stmt in any constructor
        System.out.println("This is sub class");
        
    }
    void sum(int c,int d)
    {
        int sum;
        sum=c+d;
        System.out.println("The sum: "+sum);
    }
    void sum(int d)
    {
        int sum;
        sum=c+d;
        System.out.println("The sum: "+sum);
        

    }
    void show()
    {
        
        System.out.println("This is child class");
    }
    
    void display()
    {
        show();
        super.show();
    }
    
    public static void main(String[] args) {
        Overriding o=new Overriding();
        //o.show();
        //Superclass s=new Superclass();
        o.sum(5,3);
        o.sum(7);
        o.display();
        System.out.println("===========");
        //Superclass s=new Superclass();
        //o.show();
        o.sum(8,4);
        o.sum(7);
    }
}
class Superclass
{
    int a=10;
    int b=4;
    Superclass()
    {
        System.out.println("This is super class");
    }
    
    void sum(int a,int b)
    {
        int sum=0;
        sum=a+b;
        System.out.println("The sum: "+sum);
    }
    void sum(int a)
    {
        int sum;
        sum=a+b;
        System.out.println("The sum: "+sum);
    }
    void show()
    {
        System.out.println("This is parent class");
    }

}
//Method overriding: Writing 2 or more methods in different classes having same method name,parameters and same return type.
//run-time polymorphism
//if we can't inherit we can override except private methods.
//method present in parent classes called Overridden method
//method present in child classses called overridding method
//Inheritance is mandatory for method overriding
//modifiers order is important while inheriting (private methods cannot be overridden)
//doubt   //if u don't want a method to be overridden then declare it as final.
// static methods cannot be overridden.It's also known as method hiding.
//have same return type and we can call parent class method by using super keyword.
//constructors can never be overridden becz they don't have same constructor name
// Constructor chaining: The process of calling a sequence of constructors
//this():- in same clss,super():- in child clsses



