package AssignmentOops;

import java.util.Scanner;
public class No4 {

    public static void main(String[] args) throws Exception {
        // Triangle tr=new Triangle(5,7,9);
        // //Triangle ts=new Triangle();
        // int per=tr.a+tr.b+tr.c;
        // int de=per/2;
        // int se=(((de*(de-tr.a))*(de-tr.b))*(de-tr.c));
        // int fr=(int)Math.sqrt(se);
        // System.out.println("Result : "+ fr);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter traingle values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        NewTest newObj1 = new NewTest();
        NewTest newObj = new NewTest(a, b, c);

      Triangle1 tr = new Triangle1(a, b, c);
      int perimeter=tr.calculateParimeter();
      System.out.println("perimeter value: "+perimeter);
      int area=tr.calculateArea(perimeter);
      System.out.println("Area value: "+area);
    }
}

class NewTest{
    int a, b, c;

    NewTest(){
        System.out.println("In default");
    }

    NewTest(int x, int y, int z){
        a = x; b = y; c = z;
        System.out.println("In parameteris=ed");
    }
}


class Triangle1{
    int a,b,c;
    
   // System.out.println("Triangle of a, b, c: ");
    // int a=sc.nextInt();
    // int b=sc.nextInt();
    // int c=sc.nextInt();
// Triangle(){
//     System.out.println("with Parameters");
// }
//Triangle(int a, int b, int c){
   // a=a; b=b; c=c;
//     System.out.println("give traingle values");
//     System.out.println(a+" "+b+" "+c);
// }
Triangle1(int d, int e, int f){
    a=d; b=e; c=f;
    System.out.println("In triangle construcor");
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
