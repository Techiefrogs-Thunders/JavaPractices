package AssignmentOOPS;

public class Triangle {
    
    int side1 = 3, side2 = 4, side3 = 5;
    
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.triArea();
        Triangle triangle2 = new Triangle(3, 4, 5);
        triangle2.triArea();


    }
    
    Triangle(){

    }

    Triangle(int s1, int s2, int s3){
        s1 = side1;
        s2 = side2;
        s3 = side3;
    }

    void triArea(){
        int perimeter = side1+side2+side3;
        System.out.println("Perimeter " + perimeter);
        double s = (perimeter)/2;
        double area = (s*(s-side1)*(s-side2)*(s-side3));
        area = Math.pow(area, 0.5);
        System.out.println("Area: " + area + " sq.unit ");

    }
}
