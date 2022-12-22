package Inheritanceassignment;

public class Subclass {
    
}
class Shape{
    void shape()
    {
        System.out.println("This is shape");
        
    }
}
class Rectangle extends Shape{
    void rectangle(){
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape{
    void circle()
    {
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle{
    void square()
    {
        System.out.println("Square of Rectangle");
    }
    public static void main(String[] args) {
        Square s=new Square();
        s.square();
        s.rectangle();
        s.shape();
        
    }
}