package AssignmentOops;

import java.util.Scanner;

public class No6 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enrer values");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area ar=new Area(l, b);
       ar.getArea();
       System.out.println("results");
    }
}
class Area{
    int Lenght, breath;
    Area(int l,int b){
        Lenght=l;
        breath=b;
    }

public int setDim(){
    int setdim=Lenght*breath;
    return setdim;
}
public void getArea(){
    System.out.println(setDim());
}
}