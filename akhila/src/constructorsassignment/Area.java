package constructorsassignment;
public class Area {
    int length;
    int breadth;
    Area(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int setDim()
    {
        int res=length*breadth;
        return res;
    }
    void getArea()
    {
        System.out.println("Area "+setDim());
    }
    public static void main(String[] args) {
       Area area= new Area(4,5);
       area.getArea();
    }
}
