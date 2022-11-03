package Inheritance;

public class Circle11 {   //Inheritance11
    public final double PI = 3.14;
    private double radius;
    private String color;
    double area;

    Circle11(){

    }

    Circle11(double radius){
        this.radius = radius;
    }

    Circle11(double radius,String color){

        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        //System.out.println("Area of Circle is: ");
        return (PI*radius*radius);
    }


    public String toString(){
       return "Circle[radius=r,color=c]";
    }
    
}
