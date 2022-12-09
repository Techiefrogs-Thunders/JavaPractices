package ExceptionAssignment;

public class P15 {
    public static void main(String[] args) {
        try{
            int a[]=new int[-5];
            throw new NegativeArraySizeException("by negative array size ");

        }
        catch(NegativeArraySizeException n){
            System.out.println(n);
        }
    }
}
