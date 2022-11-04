package OperatorsAndTypes;

public class TernaryAndComparisionOpe {
public static void main(String[] args) {
    int a=25, b=16, c;
    c=a;
//Comparision operator
    System.out.println(a>b);
    System.out.println(a<b | b<a);
    System.out.println(a=b);
    System.out.println(a==b);
    System.out.println(b!=b);
    System.out.println(a>=b);
    System.out.println(b<=c);    
    
    System.out.println("Ternary operator");
    int rate=(a<b)?a:b; //(?a:b)"?" evaluate true or fals condition based on that a=true, b=false print false i.eb=26
    int name=(--a>b++)?a:b;
    //int fun=((++a>b--)(a++<b++))?a:b;
    System.out.println(rate);
    System.out.println(name);








}

}