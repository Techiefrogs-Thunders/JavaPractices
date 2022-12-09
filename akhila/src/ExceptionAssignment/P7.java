package ExceptionAssignment;
import java.util.*;
public class P7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println(c);
            ArithmeticException ar=new ArithmeticException("Exception");
            ar.initCause(new Exception("This is the actual cause"));
            throw ar;
        }
        catch(Exception io){
            System.out.println(io);
            
        }
        finally{
            sc.close();
        }
    }
}
