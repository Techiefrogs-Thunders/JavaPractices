package OperatorsAndTypes;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LogicalAndBitwiseope {
     static int a=10, b=20, c=15;
    public static void main(String[] args) {
        //Logical operator (&&, ||)
        System.out.println("Logic operator &&");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);
System.out.println(a>b && c<b); //(10>20 && 15<20)-(false&&true)-false
//in the above condition if first value false(any value false) it will not check second contion, anything with false false only)
System.out.println("Logic operator ||");
        System.out.println(true||true);
        System.out.println(false||false);
        System.out.println(true||false);
        System.out.println(false||true);
System.out.println("Logic operator with unary operator");
        System.out.println(a>b || c<b); 
        System.out.println(a++>b-- && --c>++b); 
        System.out.println(++a>--c || c++>b++);
//in the above condition if first value true(any value true) it will not check second contion, anything with true true only)
        //Bitwise operator(&, |)
System.out.println("bitwise operator with &");
        System.out.println(true&true);
        System.out.println(true&false);
        System.out.println(false&true);
        System.out.println(false&false);
        System.out.println(a<b & c>b); // (10<20 & 15>20)-(true | false)-false
//in the above condition if first value true/false it will surely check second value, anything with false false only)
System.out.println("bitwise operator with |");
        System.out.println(true|true);
        System.out.println(false|false);
        System.out.println(true|false);
        System.out.println(false|true);
System.out.println("Bitwise operator with unary operator");
        System.out.println(a<b | c>b); // (10<20 | 15>20)-(true | false)-true
//in the above condition if first value true/false it will surely check second value, anything with true true only)
        System.out.println(a<b & c>b); 
        System.out.println(a>b | c<b); 
        System.out.println(--b>a-- & --c>c++); 
        System.out.println(++a>--c | c++>b++); 

}
    
}
