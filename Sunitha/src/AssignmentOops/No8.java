package AssignmentOops;

import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter average numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Average av=new Average(a,b,c);
        int result=av.calAverage();
        System.out.println(result);
        
    }
}
class Average{
    int a,b,c;

    Average(int d, int e, int f){
        a=d;
        b=e;
        c=f;

    }
    public int calAverage() {
        int ave=a+b+c;
        int re=ave/3;
        return re;
        
}
}