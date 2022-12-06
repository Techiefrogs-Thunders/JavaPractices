package ExceptionAssignment;

public class P3 {
    public static void main(String[] args) {
        int a=9;
        int b=0;
        try{
            int c=a/b;
            throw new ArithmeticException("not valid");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
