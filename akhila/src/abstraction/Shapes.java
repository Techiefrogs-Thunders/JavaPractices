package abstraction;

public class Shapes {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.color();
        s.color1();
    }
}
class Shape implements Circle,Rectangle{
    public void color()
    {
        System.out.println("The color of circle is red");
    }
    public void color1()
    {
        System.out.println("The color of the rectangle is green");
    }
    
}
interface Circle
{
    void color();
}
interface Rectangle
{
    void color1();
}