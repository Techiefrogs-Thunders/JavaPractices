package ExceptionAssignment;

public class P23 {
    public static void main(String[] args) {
        int a[]=new int[4];
        try{
            a[0]=1;
            a[1]=2;
            a[2]=3;
            a[3]=4;
            a[4]=5;
        }
        catch(ArrayIndexOutOfBoundsException arr){
            //arr.printStackTrace();
            System.out.println(arr);
        }
        finally{
            System.out.println("finally");
        }
    }
}
