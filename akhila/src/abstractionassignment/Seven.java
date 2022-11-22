package abstractionassignment;
public class Seven {
  public static void main(String[] args) {
    Rectangle r=new Rectangle();
  new Rectangle(4,5);
  new Rectangle(4,5,"red",false);
  System.out.println(r.getArea());
  System.out.println(r.getPerimeter());
  System.out.println(r.toString());
  r.setWidth(4);
  System.out.println(r.getWidth());
  r.setLength(5);
  System.out.println(r.getLength());
  Square s=new Square();
  new Square(5);
  new Square(5,"red",true);
  System.out.println(s.getArea());
  System.out.println(s.getPerimeter());
  System.out.println(s.toString());
  s.setSide(5);
  System.out.println(s.getSide());
  Circle c=new Circle();
  new Circle(5);
  new Circle(5,"red",true);
  System.out.println(c.getArea());
  System.out.println(c.getPerimeter());
  System.out.println(c.toString());
  c.setRadius(5);
  System.out.println(c.getRadius());
  }
  
}
abstract class Shape{
    protected String color;
    protected boolean filled;
    Shape()
    {
        color="red";
        filled=true;
    }
    Shape(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        color=this.color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled){
        filled=this.filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Rectangle extends Shape{
    private double width;
    private double length;
    Rectangle()
    {
        super();
        width=1.0;
        length=1.0;
    }
    Rectangle(double width,double length)
    {
       super();
       width=this.width;
       length=this.length;
    }
    Rectangle(double width,double length,String color,boolean filled)
    {
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        width=this.width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        length=this.length;
    }
    public double getArea()
    {
        double area;
        area=length*width;
        return area;
    }
    public double getPerimeter()
    {
        double perimeter;
        perimeter=2*(length+width);
        return perimeter;
    }
    public String toString()
    {
        return "A Rectangle with width "+width+" and length "+length+",which is a subclass of Shape";
        
    }
}
class Square extends Rectangle
{
    protected double side;
    Square()
    {
        super();
    }
    Square(double side)
    {
        super(side,side);

    }
    Square(double side,String color,boolean filled)
    {
        super(side,side,color,filled);
        this.side=side;
    }
    public double getSide()
    {
        return super.getWidth();
    }
    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }
    public double getArea()
    {
        return getSide()*getSide();
    }
    public double getPerimeter()
    {
        return 4*getSide();
    }
    public String toString()
    {
        return "A square with side "+getSide()+" ,which is a subclass of Rectangle class";
    }
}
class Circle extends Shape{
    protected double radius;
    Circle()
    {
        super();
        radius=1.0;
    }
    Circle(double radius)
    {
        super();
        this.radius=radius;
    }
    Circle(double radius,String color,boolean b)
    {
        super(color,b);
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public String toString()
    {
        return "A Circle with radius "+radius+" , which is a subclass of Shape class";
    }
}