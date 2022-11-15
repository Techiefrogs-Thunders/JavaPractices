package abstraction;



public class Main1 {
    public static void main(String[] args) {
        Shape s1=new Circle("Red",3);
    Shape s2=new Rectangle("Green",4,7);
    
    System.out.println(s1.toString());
    System.out.println(s2.toString());
    }
}
abstract class Shape{
    String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color)
    {
        System.out.println("Shape constructor called ");
        this.color=color;
    }
    public String getColor()
    {
        return this.color;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(String color,double radius) {
        super(color);
        //TODO Auto-generated constructor stub
        System.out.println("circle() constructor");
        this.radius=radius;
    }
    
    public double area()
    {
        double area=Math.PI*radius*radius;
        return area;
    }
    public String toString()
    {
        return "Circle color is "+super.getColor()+" and area is "+area();
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(String color,double length,double breadth)
    {
        super(color);
        System.out.println("Rectangle constructor called");
        this.length=length;
        this.breadth=breadth;
    }
    public double area()
    {
        return length*breadth;
    }
    public String toString()
    {
        return "Rectangle color is "+super.getColor()+" and the area is "+area();
    }
}
//class that is declared with an abstract keyword
//no method body
//an abstract clss may or maynot have all abstract methods
//overridding compulsory or making sub clss itself abstract
//can create as many as abstract methods in a clss but no object

