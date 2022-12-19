package ClassObjectsAssignment;

public class Triangle {
    int a = 3,b=4,c=5;
    Triangle(){
        float area;
        int perimeter;
        int s=(a+b+c)/2;
        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        perimeter=a+b+c;
        System.out.println("area is "+area);
        System.out.println("perimeter is "+perimeter);
    }
    Triangle(int a,int b,int c){
        float area;
        int perimeter;
        int s=(a+b+c)/2;
        area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        perimeter=a+b+c;
        System.out.println("area is "+area);
        System.out.println("perimeter is "+perimeter);
    }
    public static void main(String[] args) {
        new Triangle();
        new Triangle(3,4,5);
    }
    
}
