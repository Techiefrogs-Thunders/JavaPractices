package constructorsassignment;

public class areawithparameters {
    public areawithparameters(int a,int b,int c)
    {
        int s;
        int area,perimeter;
        s=(a+b+c)/2;
        area=(s*(s-a)*(s-b)*(s-c))^(1/2);
        perimeter=a+b+c;
        System.out.println("Area of triangle "+area);
        System.out.println("The perimeter of the triangle "+perimeter);
    }
    public static void main(String[] args) {
        new areawithparameters(3, 4, 5);
    }
}
