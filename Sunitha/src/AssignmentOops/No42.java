package AssignmentOops;

import java.util.Scanner;

public class No42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter traingle values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
      //Triangle tr=new Triangle(a, b, c);
      Triangle tr=new Triangle(a, b, c);
      int perimeter=tr.calculateParimeter();
      System.out.println("perimeter value: "+perimeter);
      int area=tr.calculateArea(perimeter);
      System.out.println("Area value: "+area);
}
}
class Triangle{
    int a,b,c;
    Triangle(int d, int e, int f){
        a=d; b=e; c=f;
    }
    public int calculateParimeter(){
        int per=a+b+c;
        int de=per/2;
        return de;
    }
    public int calculateArea(int de){
        
        int se=(((de*(de-a))*(de-b))*(de-c));
        int fr=(int)Math.sqrt(se);
        return fr;
    }
    
        
    }    
