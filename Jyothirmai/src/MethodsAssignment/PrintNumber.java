package MethodsAssignment;

public class PrintNumber {
    public static void main(String[] args) {
        PrintNumber meth = new PrintNumber();
        System.out.println(meth.printn(10, 20));
        System.out.println(meth.printn("jerhfbsryug"));
        System.out.println(meth.printn(62354.523));
        System.out.println(meth.printn('c'));
    }
    int printn(int a, int b){
        return a+b;
    }
    String printn(String name){
        return name;
    }
    double printn(double num){
        return num;
    }
    char printn(char ch){
         return ch;
    }
}
