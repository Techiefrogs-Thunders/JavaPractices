package interfaceassignment;

public class One {
    
    public static void main(String[] args) {
     
    RegularPolygon[] rparray=new RegularPolygon[2];
    rparray[0]=new EquilateralTriangle(6);
    System.out.println(rparray[0].getNumSides());
    System.out.println(rparray[0].getSideLength());
    System.out.println(rparray[0].getPerimeter());
    System.out.println(rparray[0].getInteriorAngle());
    rparray[1]=new Square(5);
    System.out.println(rparray[1].getNumSides());
    System.out.println(rparray[1].getSideLength());
    System.out.println(rparray[1].getPerimeter());
    System.out.println(rparray[1].getInteriorAngle());
    //EquilateralTriangle equi=new EquilateralTriangle(0)

    
    }
}
interface RegularPolygon{
    abstract int getNumSides();
    abstract int getSideLength();
    static double totalSides(RegularPolygon[] rparray){
        double sum=0;
        if(rparray.length==0){
            return 0;
        }
        for(RegularPolygon rp:rparray){
            double measure=rp.getNumSides();
            sum=sum+measure;
        }
        return sum;
    }
    default int getPerimeter(){
        return getNumSides()*getSideLength();
    }
    default double getInteriorAngle(){
        return ((getNumSides()-2)*Math.PI/getNumSides());
    }
    
}
class EquilateralTriangle implements RegularPolygon{
    private int SideLength;
    EquilateralTriangle(int SideLength)
    {
        System.out.println("EquilateralTriangle() constructor");
    }
    public int getNumSides()
    {
        return 3;
    }
    public int getSideLength()
    {
        return SideLength;
    }
    
}
class Square implements RegularPolygon{
    private int SideLength;
    Square(int SideLength)
    {
        System.out.println("Square()-parameterised constructor");
    }
    public int getNumSides()
    {
        return 4;
    }
    public int getSideLength()
    {
        return SideLength;
    }
    
}