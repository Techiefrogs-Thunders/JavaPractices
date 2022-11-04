package OperatorsAndTypes;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Operator {
    static boolean g=true;
    static int a=2+1, b=5-1, c=6-1, q=9, p=7;
    static double R=2.2;
public static void main(String[] args) {
     byte d=19, e=-87; 
    //Unary operator(++z, z++, --z,z--, ~, !)
System.out.println(a++ + ++a); 
System.out.println("this is increment of A:" +a);
System.out.println(++c - c++); //6 -6
System.out.println("this is increment of C:" +c);
System.out.println(--b + b--); 
System.out.println("this is increment of B:" +b);
System.out.println(~d); 
System.out.println(~e); 
System.out.println(!g); 
    
 //Arithmetic opeartor (/ %)
 System.out.println("Arithmethic / result:"+ 14/3); 
 System.out.println("Arithmethic % result:"+ 14%3);
 System.out.println(a + c - b*a );
     // Shift Operator (>> <<)
 System.out.println(q>>p); 
 System.out.println(q<<p); 

  //Logical operator (&&, ||)
System.out.println("logical operators");
System.out.println(a>b && c<b); 
System.out.println(a>b || c<b); 
System.out.println(a++>b-- && --c>++b); //(26>32 && 6>32 ) false && false=false
System.out.println(++a>--c || c++>b++); //(27>6 || 6>33 ) true || false=true
// Bitwise operator (& |) 
System.out.println("Bitwise operators");
System.out.println(a<b & c>b); 
System.out.println(a>b | c<b); 
System.out.println(--b>a-- & --c>c++); //(31>26 && 6>6) true & false=false
System.out.println(++a>--c | c++>b++); //(27>6 || 6>33 ) true | false=true 

//Comparision operator
System.out.println(a++<=--b || R++==c-- & (++b<=c-- && a!=c++));
System.out.println(--a>=b++ & q!=b-- && p++<--a);

System.out.println("Ternary operator");
int rate=(a!=R==b++>c--)?a:b; 
int name=(--a>R++)?a:b;
//int fun=((++a>b--)(a++<b++))?a:b;
System.out.println(rate + name);
}
}
