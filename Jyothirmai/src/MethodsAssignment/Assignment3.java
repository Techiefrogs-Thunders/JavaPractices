package MethodsAssignment;

public class Assignment3 {
    public static void main(String[] args) {
        Assignment3 meth = new Assignment3();
        meth.area(6, 9);
        meth.area(7);
        
    }
    void area(int l,int b){
        System.out.println("area of rectangle is : " + l*b);
    }
    void area(int a){
        System.out.println("area of square is : " + a*a);
    }
}
