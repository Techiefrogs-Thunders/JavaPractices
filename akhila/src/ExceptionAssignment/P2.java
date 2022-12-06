package ExceptionAssignment;

public class P2 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        try{
            arr[10]=50/0;
        }
        catch(NullPointerException p){
            System.out.println(p.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar.getMessage());
        }
        catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
