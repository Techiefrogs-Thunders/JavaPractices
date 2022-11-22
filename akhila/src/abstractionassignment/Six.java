package abstractionassignment;

public class Six {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.RectangleArea(4,6);
        Square s=new Square();
        s.SquareArea(4);
        Circle c=new Circle();
        c.CircleArea(5);
        
    }
}
abstract class Shape{
    abstract void SquareArea(int side);
    abstract void RectangleArea(int length,int breadth);
    abstract void CircleArea(int radius);
}
class Rectangle extends Shape{
    void SquareArea(int side)
    {
        
    }
    void RectangleArea(int length,int breadth)
    {
        int Area=length*breadth;
        System.out.println(Area);
    }
    void CircleArea(int radius)
    {

    }
}
class Square extends Shape
{
    void SquareArea(int side)
    {
        int Area=side*side;
        System.out.println(Area);
    }
    void RectangleArea(int length,int breadth)
    {
        
    }
    void CircleArea(int radius)
    {
        
    }
}
class Circle extends Shape{
    void SquareArea(int side)
    {
        
    }
    void RectangleArea(int length,int breadth)
    {
        
    }
    void CircleArea(int radius)
    {
        int Area=(int) (Math.PI*radius*radius);
        System.out.println(Area);
    }
}