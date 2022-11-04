package assignmentsInheritance;

public class CylinderAndGas {
    public static void main(String[] args) {
        Cylinder cyl=new Cylinder();
        Cylinder cyli=new Cylinder(1.0);
        Cylinder cylin=new Cylinder(10.02, 20.02);
        Cylinder cylind=new Cylinder(12.09, 13.09, "red");
        //Circle cc=new Circle();
        System.out.println(cyli.radious);
    }
    
}

class Circle{
    String color="red";
    double radious=1.2;
    Circle(){
        System.out.println("print circle constructor");
    }
    Circle(double r){
       this.radious=r;
    }
    Circle(String c, double r){
        this.radious=r;
        this.color=c;
    }
   double  getRadious(){
    return radious;
        
    }
    void setRadious(double radious){
        System.out.println(radious);
    }
    String getColor(){
        return color;
        
    }
    void setColor(String color){
        System.out.println(color);
    }
public double getArea(){  //(=2π×radius×height + 2×base-area
return getRadious();
// return super.radious*get+2*getArea();
}
public String toString(){
return getColor();
}
}

class Cylinder extends Circle{
double height=1.0;
Cylinder(){

}
Cylinder(double r){
    radious=r;
  // super.radious=r;
  //super(r);
  //System.out.println(radious);

}
Cylinder(double r, double r1){
    radious=r;
    radious=r1;
}
Cylinder(double r, double r1, String c){
    radious=r;
    radious=r1;
    color=c;
}
double getHeight(){
    return height;
}
void setHeight(double height){
    System.out.println(height);
}
double getVolume(){
    return getHeight();
}

}
