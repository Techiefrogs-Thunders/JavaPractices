package interfaceassignment;
import java.util.Scanner;
public class Nine {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
            Circle c=new Circle();
            c.get(sc);
            c.input(sc);
            c.output();
        
            Rectangle r=new Rectangle();
            r.get(sc);
            r.input(sc);
            r.output();
        sc.close();
       }
    }

class Signs{
    double area;
    String color;
    String text;
    void get(Scanner sc)
    {
        
        System.out.println("color:");
        sc.nextLine();
        color=sc.nextLine();
        System.out.println("text: ");
        text=sc.nextLine();
        //sc.close();
    }
}
interface Shapes{
    //Scanner sc=new Scanner(System.in);
    void input(Scanner sc);
    void output();
}
class Circle extends Signs implements Shapes{
    int r;
    public void input(Scanner sc)
    {
        System.out.println("radius: ");
        //Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=Math.PI*r*r;
        //sc.close();
    }
    public void output()
    {
        System.out.println("===circle===");
        System.out.println("text: "+text);
        System.out.println("color: "+color);
        System.out.println("radius: "+r);
        System.out.println("area: "+area);
    }
}
class Rectangle extends Signs implements Shapes{
    int l,b;
    public void input(Scanner sc)
    {
        //Scanner sc=new Scanner(System.in);
        System.out.println("length:");
        l=sc.nextInt();
        System.out.println("Breadth:");
        b=sc.nextInt();
        area=l*b;
        //sc.close();
    }
    public void output()
    {
        System.out.println("===Rectangle===");
        System.out.println("text:"+text);
        System.out.println("color:"+color);
        System.out.println("length:"+l);
        System.out.println("breadth:"+b);
        System.out.println("area: "+area);
    }
}