public class Exception5 {
    public static void main(String[] args) {
        int a[]=new int[3];
        try{
            try{
                System.out.println("by zero");
                int b=5/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            a[3]=5;
        }
        catch(ArrayIndexOutOfBoundsException arr){
            System.out.println(arr);
        }
    }
}
