package OperatorsAndTypes;

public class ArthimethicAndShiftOpe {
    static boolean g=true;
    static int a=23+1, b=34, c=6-1, q=3, p=2;
    static double R=2.2;
public static void main(String[] args) {
   
    //Arithmetic opeartor (/ %)
System.out.println("Arithmethic / result:"+ 14/5); //devider will give result of actual value not decimal(4.6)
System.out.println("Arithmethic % result:"+ 16%12); //percentail will give remaind value i.e 2(14/3(4*3=12 and balance 2)=2
System.out.println(a + c - b*a );
    // Shift Operator (>> <<)
System.out.println(q>>p); //[c/(2^p)]=3/(2^2)=0
System.out.println(q<<p); //[c*(2^p)]=3*(2^2)= 12
}
}
