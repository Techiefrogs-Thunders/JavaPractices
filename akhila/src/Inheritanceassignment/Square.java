package Inheritanceassignment;
public class Square extends Rectangle{
    
    public Square(int s)
    {
        
        super(s,s);
    }
    
    public static void main(String[] args) {
        Square sq=new Square(5);
        sq.area();
        sq.perimeter();
        Rectangle r=new Rectangle(4,5);
        r.area();
        r.perimeter();

    }
}
class Rectangle {
    int length,breadth;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void area()
    {
        int area=length*breadth;
        System.out.println("Area of Rectangle: "+area);
    }
    void perimeter()
    {
        int perimeter=2*(length+breadth);
        System.out.println("The perimeter of Rectangle: "+perimeter);
    }
}
