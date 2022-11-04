package AssignmengsMethods;

public class RectangleArea {
    int length;
    public static void main(String[] args) {
        RectangleArea r=new RectangleArea();
        r.rectangle(11.1f);
        r.rectangle(121, 10);
        
    }

    public void rectangle(int s, int i) {
        System.out.println("Rectangle value: "+s*i);

        
    }
    public void rectangle(float f) {
        System.out.println("square values: "+f*f);
    }
    
}
