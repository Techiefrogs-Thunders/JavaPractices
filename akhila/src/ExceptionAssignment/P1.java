package ExceptionAssignment;

public class P1 {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        try{
            int c=a+b;
            System.out.println(c);
        }
        catch(ArithmeticException ar){
            System.out.println(ar);
        }
    }
}
