package InheritanceAssignments;

public class Assignment11 {
    public static void main(String[] args) {
        
    }
}
class Circle{
    protected double radius = 1.0;
    protected String colour = "red";
    protected double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    Circle(){
        System.out.println("In Circle constructor");

    }
    Circle(double radius){
        this.radius=radius;
        System.out.println("In Circle param constructor");
    }
    Circle(double radius,String colour){
        this.radius=radius;
        this.colour=colour;
        System.out.println("In Circle double param constructor");
    }

    }
class Cylinder extends Circle {
    protected double height = 1.0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    Cylinder(){
        System.out.println("In cylinder constructor");
    }
    Cylinder(double radius){
        this.radius = radius;
        System.out.println("In cylinder param constructor");
    }
    Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
        System.out.println("In cylinder double param constructor");
    }
    Cylinder(double radius,double height,String colour){
        this.radius = radius;
        this.height = height;
        this.colour = colour;
        System.out.println("In cylinder three param constructor");
    }

}
