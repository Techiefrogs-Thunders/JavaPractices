package AssignmentOops;

import java.util.Scanner;

public class No11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two distance no");
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int f1=sc.nextInt();
        int f2=sc.nextInt();
        AddDistance dt=new AddDistance(d1,d2,f1,f2);
        dt.getDistance();      
    }
}
class AddDistance{
    int d1,d2, f1,f2;
    AddDistance(int a1,int a2,int b1,int b2){
        d1=a1; d2=a2; b1=f1; b2=f2;
        System.out.println();
    }
    public void getDistance() {
        int d=d1+d2;
        int l=0;
        if (d>12) {
            l=d/12;
            d=d%12;
            int fe=f1+f2+l;
            System.out.println(fe+" "+l);
        }    
    }
}
