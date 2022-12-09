package ExceptionAssignment;

public class P22 {
    public static void main(String[] args) {    
    int a[]=new int[3];
        try{
            
            a[3]=5;
        }
        catch(ArrayIndexOutOfBoundsException arr){
            System.out.println(arr);
        }
        try{
            System.out.println("by zero");
            int b=5/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
