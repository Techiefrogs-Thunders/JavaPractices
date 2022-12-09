package ExceptionAssignment;
public class P11 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{
            arr[0]=6;
            arr[1]=2;
            arr[2]=1;
            arr[3]=9;
            arr[4]=7;
            arr[5]=3;
        }
        catch(ArithmeticException ar){
            System.out.println("ArithmeticException");
        }
        catch(NullPointerException n){
            System.out.println("NullPointerException");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("ArrayIndexOutOfBoundException");
        }
    }
}
