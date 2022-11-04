package assignmentsInheritance;

public class RectangleofLen {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(24, 42);
        Square s=new Square(56);
        r.messureAre();
        s.messureArea();
        s.messureAre();
        s.messureArea();
        
    }
}

class Rectangle{
    int length, breadth;
   public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
       // System.out.println("Rectangle constructor: " +length+"  --  "+breadth);
    }
    void messureAre(){
        System.out.println("calculate measure area: "+ length*breadth);
    }
    void messureArea(){
        System.out.println("calculate primer value: "+ 2*(length+breadth));
    }
}

class Square extends Rectangle{
    int s;
    public Square(int s){
        super(s,s);
       // System.out.println("calculate square value: "+ s*s);
    }

}
