package Inheritance;

class Rectangle{
    private int length, breadth;
    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    void print_area(){
        System.out.println(length*breadth);
    }
    void print_perimeter(){
        System.out.println(2*(length+breadth));
    }
}
class Square extends Rectangle{

    public Square(int s){
        super(s, s);
    }
     

}
public class Inheritance4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        Square s = new Square(4);
        r.print_area();
        r.print_perimeter();
        s.print_area();
        s.print_perimeter();
        
    }
    
}
