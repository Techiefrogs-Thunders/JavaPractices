package AbstractAssignment;

public class Assignment6 {
    public static void main(String[] args) {
        Area area = new Area();
        area.RectangleArea(7, 9);
        area.SquareArea(8);
        area.CircleArea(9);
    }
}
abstract class Shape{
    abstract void RectangleArea(int l, int b);
    abstract void SquareArea(int c);
    abstract void CircleArea(int d);
}
class Area extends Shape{
    int Area;
    void RectangleArea(int l, int b){
        Area = l*b;
        System.out.println("Area of Rectangle is: "+ Area);
    }
    void SquareArea(int side){
        Area = side*side;
        System.out.println("Area of Square is: "+ Area);
    }
    void CircleArea(int radius){
        double Area;
        Area = (radius*radius)*Math.PI;
        System.out.println("Area of Circle is: "+ Area);
    }
}

