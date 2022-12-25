package AbstractAssignment;

public class Assignment7 {
    private static final boolean True = false;

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        circle.getArea();
        circle.getPerimeter();
        square.getArea();
        square.getPerimeter();
        System.out.println(circle.toString());
        System.out.println(circle.getRadius());

    }
}
 abstract class Shape{
    protected String colour = "red";
    protected boolean filled = true;
    Shape(){
        System.out.println("Constructor in shape with no parameters");
    }
    Shape(String colour, boolean filled){
        System.out.println("Constructor in shape with parameters");
    }
    abstract void getArea();
    abstract void getPerimeter();
    public String toString(){
        return "Jyothi";
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    void display(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;
    Rectangle(){
        System.out.println("Constructor in Rectangle with no parameters");
    }
    Rectangle(double width,double length){
        System.out.println("Constructor in Rectangle with parameters");
    }
    Rectangle(double width,double length,String colour,boolean filled){
        System.out.println("Constructor in Rectangle with four parameters");
    }
    public String toString(){
        return "Jyothirmai";
    }
    
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    void getArea(){
        System.out.println();
    }
    void getPerimeter(){
        System.out.println();
    }

}
class Circle extends Shape{
    double radius = 1.0;
    Circle(){
        System.out.println("Constructor in Circle");
    }
    Circle(double radius){
        System.out.println("Constructor in parameter Circle");
    }
    Circle(double radius,String colour,boolean filled){
        System.out.println("Circle three parameter constructor");
    }
    public String toString(){
        return "Satya";
    }
    void getArea(){
        System.out.println();
    }
    void getPerimeter(){
        System.out.println();
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

}
class Square extends Rectangle{
    double side;
    Square(){
        System.out.println("Constructor in Square");
    }
    Square(double side){
        System.out.println("Constructor in parameter");
    }
    Square(double side, String colour, boolean filled){
        System.out.println("Constructor in Square with three paramwers");
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }

    public String toString(){
        return "satya sai sri";
    }
}