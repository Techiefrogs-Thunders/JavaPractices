package Inheritanceassignment;
public class TestCylinder extends Cylinder
{
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        System.out.println("Radius is "+c1.getRadius()
        +", Height is "+c1.getHeight()
        +", color is "+c1.getColor()
        +",Base area is "+c1.getArea()
        +",Volome is "+c1.getVolume());
        Cylinder c2=new Cylinder();
        System.out.println("Radius is "+c2.getRadius()
        +", Color is "+c2.getColor()
        +",Height is "+c2.getHeight()
        +", baseArea is "+c2.getArea()
        +",Volume is "+c2.getVolume());
    } 
}
class Cylinder extends Circle{
    private double height;
   public Cylinder()
   {
    super();
    this.height=1.0;
    System.out.println("Constructed a Cylinder with Cylinder()");
   }  
   public Cylinder(double height)
   {
    super();
    this.height=height;
    System.out.println("Constructed a  Cylinder with Cylinder(height)");
   }
   public Cylinder(double radius,double height)
   {
    super(radius);
    this.height=height;
    System.out.println("Constructed a cylinder with cylinder(radius,height");
   }
   public Cylinder(double height,double radius,String color)
   {
    super(radius,color);
    this.height=height;
    System.out.println("Constructed a cylinder with cylinder(height,radius,color)");
   }
   public double getHeight()
   {
    return this.height;
   }
   public void setHeight(double height)
   {
    this.height=height;
   }
   public double getVolume()
   {
    return getArea()*height;
   }
}
class Circle
{
    private double radius ;
    private String color;
    public Circle()
    {
        this.radius=1.0;
        this.color="red";
        System.out.println("Constructed a circle withCircle()");
    }
    public Circle(double radius)
    {
        this.radius=radius;
        this.color="red";
        System.out.println("constructed a circle with Circle(radius)");
    }
    public Circle(double radius, String color)
    {
        this.radius=radius;
        this.color=color;
        System.out.println("Constructed a circle with Circle(radius,color)");
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public double getArea()
    {
        return radius*radius*Math.PI;
    }
    public String toString()
    {
        return "Circle[radius= " + radius + ",color=" + color + "]";
    }
}