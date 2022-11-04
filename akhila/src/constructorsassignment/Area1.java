package constructorsassignment;

public class Area1 {
    int length;
    int breadth;
    Area1(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int returnArea()
    {
        int area=length*breadth;
        return area;
    }
    public static void main(String[] args) {
        Area1 obj=new Area1(4,5);
        System.out.println("Area "+obj.returnArea());
    }
}
