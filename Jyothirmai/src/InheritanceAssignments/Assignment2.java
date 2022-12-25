package InheritanceAssignments;

public class Assignment2 {
    
}
class Rectangle{
    int length;
    int breadth;
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        int A = length*breadth;
        System.out.println("Area of rectangle is: "+A);
    }
    void perimeter(){
        int P = 2*(length+breadth);
        System.out.println("perimeter of rectangle is: "+P);
    }
}
class Square extends Rectangle{
    Square(int side){
        super(side,side);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Rectangle square = new Square(10);
        rectangle.area();
        System.out.println();
        rectangle.perimeter();
        System.out.println();
        square.area();
        square.perimeter();
    }
}