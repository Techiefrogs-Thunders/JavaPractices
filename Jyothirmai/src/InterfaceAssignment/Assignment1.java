package InterfaceAssignment;

public class Assignment1{
    public static void main(String[] args) {
        //EquilateralTriangle obj = new EquilateralTriangle(5);
        //Square obj1 = new Square(7);
        RegularPolygon[]  obj = new RegularPolygon[2];
        obj[0]=new EquilateralTriangle(4);
        System.out.println("length of equilateral triangle is: "+obj[0].getSideLength());
        System.out.println("side of equilateral triangle is: "+obj[0].getNumSides());
        obj[1]=new Square(5);
        System.out.println("length of square is: "+obj[1].getNumSides());
        System.out.println("side of square is: "+obj[1].getSideLength());
        System.out.println("perimeter is: "+obj[0].getPerimeter());
        System.out.println("Angle is: "+obj[0].getInteriorAngle());
    }
}

interface RegularPolygon{
    
    static int totalSides(RegularPolygon[] rparray){
        int sum=0;
        if(rparray.length==0){
            return 0;
        }
        for(RegularPolygon rp:rparray){
            int max = rp.getNumSides();
            sum+= max;

        }
        return sum;
    }
    default int getPerimeter(){
        int n = getNumSides();
        int length = 5;
        int perimeter = n*length;
        return perimeter; 
    }
    default double getInteriorAngle(){
        int n = getNumSides();
        double angle = ((n-2)*Math.PI/n);
        return angle;
    }
     int getNumSides();
    int getSideLength();
}
class EquilateralTriangle implements RegularPolygon{
    int length = 5;
    EquilateralTriangle(int Length){
        Length = length;
    }
    public int getNumSides() {
        return 3;
    }
    public int getSideLength() {
        return length;
    }
}
class Square implements RegularPolygon{
    int l = 7;
    Square(int Length){
        Length = l;
    }
    public int getNumSides() {
        return 4;
    }
    public int getSideLength() {
        return l;
    }  
}
