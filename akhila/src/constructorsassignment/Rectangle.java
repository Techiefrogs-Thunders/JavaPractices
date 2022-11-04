package constructorsassignment;

public class Rectangle {
      void Area(int length,int breadth)
      {
        int area;
        area=length*breadth;
        System.out.println("The area of Rectangle "+area);
      }  
      public static void main(String[] args) {
        new Rectangle().Area(4,5);
        new Rectangle().Area(5,8);
      }
}
