package OperatorsAndTypes;

public class UnaryOper {

      static boolean g=true;
      static int a=23+1, b=34, c=6-1, q=3, p=2;
public static void main(String[] args) {
      byte d=19, e=-87; 
    
     //Unary operator(++z, z++, --z,z--, ~, !)

System.out.println(a++ + ++a); 
      //24++[(a=25 bcoz of post increm)24 + pre incr(++ a=1+25= 26)] =24+26=50
System.out.println("this is increment of A:" +a);
System.out.println(++c - c++); //6 -6
System.out.println("this is increment of C:" +c);
System.out.println(--b + b--); //(pre decre(b=33) - (33(post decrement -1 it wont print and balace a=1)) =33-33 =0
System.out.println("this is increment of B:" +b);
System.out.println(~d); // "~"(negate) always change from +ve value to -ve/-ve value to +ve
System.out.println(~e); // it will convert to hexadecimal and give [(+ve value+1=-20)(-ve value-1=+86)]
System.out.println(!g); // "!"(inverse) reverse value
}
}
