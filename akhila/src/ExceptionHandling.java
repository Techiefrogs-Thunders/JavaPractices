//import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        //int a;
        //String s=null;
        String s1="adsdsds";
        
        //Scanner sc=new Scanner(System.in);
        //a=sc.nextInt();
        //int a[]=new int[5];
        
        try{
            int i=Integer.parseInt(s1);
            throw new ArithmeticException("it's an exception");
            //System.out.println(a[5]);
            
            //System.out.println(a/2);
            //System.out.println(s.length());
        }
        catch(ArrayIndexOutOfBoundsException arr){
          System.out.println(arr);
        }
        catch(NumberFormatException nf){
          System.out.println(nf);
        }
        catch(NullPointerException n){
          System.out.println(n);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            
            
            System.out.println("finally");
        }
        //sc.close();
    }
}

