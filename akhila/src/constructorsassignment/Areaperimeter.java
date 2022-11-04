package constructorsassignment;

public class Areaperimeter{
    int a=3;
    int b=4;
    int c=5;
    public Areaperimeter()
    {
        int area,perimeter;
        int s=(a+b+c)/2;
        area=(s*(s-a)*(s-b)*(s-c))^(1/2);
        perimeter=a+b+c;
        System.out.println("The area of the triangle "+area);
        System.out.println("the perimeter of the triangle "+perimeter);
    }
    public static void main(String[] args) {
        new Areaperimeter();
    }
}