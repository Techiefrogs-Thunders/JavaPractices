package InheritanceAssignments;

public class Shapes1 {
    public static void main(String[] args) {
        Square sq=new Square();
        Circle c=new Circle();
        sq.display3();
        c.display2();
        sq.display1();
        sq.display();
    }
}
class Shape{
    void display(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    void display1(){
        System.out.println("This is called Rectangular Shape");
    }

}
class Circle extends Shape{
    void display2(){
        System.out.println("This is called Circular Shape");
    }

}
class Square extends Rectangle{
    void display3(){
        System.out.println("Square is a rectangle");
    }

}