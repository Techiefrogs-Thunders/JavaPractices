package InheritanceAssignments;

public class Shapes1 {
    public static void main(String[] args) {
        Square sq=new Square();
        Circle c=new Circle();
        sq.display();
    }
}
class Shape{
    void display(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{

}
class Circle extends Shape{

}
class Square extends Rectangle{

}