package Oops_concepts;

public class Variabless {
    int a = 10; //instance variable or global
    static int c = 30; //static variable
    public static void main(String[] args) {
        int b = 20; //local variable
        System.out.println("local variable = "+b);
        System.out.println("static variable = "+c);
        Variabless obj = new Variabless(); //we have to create object for instance variable
        System.out.println("instance variable = "+obj.a);
    }
}
