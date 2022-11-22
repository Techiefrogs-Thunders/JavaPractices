package interfaceassignment;

public class One {
    public static void main(String[] args) {
        
    }
}
interface RegularPolygon{
    abstract int getNumSides();
    abstract int getSideLength();
    static int totalSides(RegularPolygon[] rpArray)
    {
        return 0 ;
    }
}
class EquilateralTriangle implements RegularPolygon{
    private int SideLength;
    EquilateralTriangle(int SideLength)
    {
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