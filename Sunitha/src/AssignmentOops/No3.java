package AssignmentOops;

import java.util.Scanner;

public class No3 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Triangle of a, b, c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        Triangle tr=new Triangle();
        int perimeter=(tr.a+tr.b+tr.c);
        int s=perimeter/2;
        int sq=(((s*(s-tr.a))*(s-tr.b))*(s-tr.c));
        int ar=(int)Math.sqrt(sq);
        System.out.println("traingle result: "+ ar);
       // System.out.println("Triangle of a, b, c: ");
    }
}
   //Triangle formanula [square root of s(s-a)(s-b)(s-c)] s=a+b+c/2
    class Triangle{
       int a,b,c;
}     
