import java.util.*;
public class Exception4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a/b);
        } 
        catch(ArithmeticException e){
            System.out.println(e);
        }   
        catch(InputMismatchException m){
            System.out.println(m);
        } 
        finally{
            sc.close();
        }
    }
}
