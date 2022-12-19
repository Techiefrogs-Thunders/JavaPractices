package MethodsAssignment;

public class PrintNumber {
    public static void main(String[] args) {
        PrintNumber meth = new PrintNumber();
        meth.add(5, 7);
        meth.name();
        meth.num();
        meth.value();
        
    }
    void add(int a, int b){
        System.out.println(a+b);
    }
    void name(){
        System.out.println("jsdhf");
    }
    void num(){
        System.out.println(345.76);
    }
    void value(){
         System.out.println('c');
    }
}
