package Statements;

public class IfElse {
    public static void main(String[] args) {
        int a=10, b=15, c=25;
        if (a++>=--b && c!=a || --b<=--a) {
            System.out.println("true");
        } else 
        {
            System.out.println("false");   
        }
System.out.println("if condition with operators");
        if (c*2>=b%a | c%a!=a & c/b==a>>b) {
            System.out.println("true");
        } else if (a>>b==c) {
            System.out.println("maybe true");
        
        } else if (b%2.2!=5 & 6/90==20 | c>>23>56 && 23<<a<=b & 45*a==22/b) {
            System.out.println("false answer");
        } else {
        
            System.out.println("false");        
    }
    }
    
}
