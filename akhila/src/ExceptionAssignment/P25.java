package ExceptionAssignment;
import java.util.*;
public class P25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            System.out.println(c);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        finally{
            System.out.println("finally");
            throw new ArithmeticException("Arithmetic EXception");
        }
    }
}
