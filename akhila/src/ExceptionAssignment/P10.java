package ExceptionAssignment;
import java.util.*;
public class P10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        try{
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
        
    }
}
