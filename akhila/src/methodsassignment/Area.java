package methodsassignment;

public class Area {
    void area(int length,int breadth)
    {
        int area=length*breadth;
        System.out.println("The area of rectangle: "+area);
    }
    void area(int side)
    {
        int area=side^2;
        System.out.println("The area of the square is: "+area);
    }
    public static void main(String[] args) {
        new Area().area(5,7);
        new Area().area(5);
    }
}
