package Abstraction;

abstract class Shape {
    public abstract double area_Rectangle(double breadth, double height);
    public abstract double area_Square(double side);
    public abstract double area_Circle(double radius);
}

class Area extends Shape{
    private static final double PI=3.14;
    @Override
    public double area_Rectangle(double breadth, double height) {
        return breadth*height;
    }

    @Override
    public double area_Square(double side) {
        return side*side;
    }

    @Override
    public double area_Circle(double radius) {
        return PI*radius*radius;
    }
}

public class Abstaction6 {
    public static void main(String[] args) {
        Area area=new Area();
        System.out.println("The Area of Rectangle: "+area.area_Rectangle(10,5));
        System.out.println("The Area of Square: "+area.area_Square(5));
        System.out.println("The Area of Circle: "+area.area_Circle(5.5));
    }
}
