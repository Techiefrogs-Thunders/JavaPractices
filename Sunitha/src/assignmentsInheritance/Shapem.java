package assignmentsInheritance;

public class Shapem {
    public static void main(String[] args) {
        Square s=new Square();
        s.rectangleMethod();
        s.shapeMethod();
        s.sqaureMethod();
        // Circle c=new Circle();
        // c.circleMethod();
    }
}

class Shape{
    void shapeMethod(){
        System.out.println("this is shape method");
    }
}
class Rectangle extends Shape{
    void rectangleMethod(){
        System.out.println("this is rectangle method");
    }

}
class Circle extends Shape{
    void circleMethod(){
        System.out.println("this is circle method");
    }
}
class Square extends Rectangle{
   public void sqaureMethod(){
        System.out.println("Square is a rectangle method");
    }
}
