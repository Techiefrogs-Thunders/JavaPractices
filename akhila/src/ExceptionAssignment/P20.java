package ExceptionAssignment;

public class P20 {
    public static void main(String[] args) {
        String s="abc";
        try{
        int a=Integer.parseInt(s);
        System.out.println(a);}
        catch(NumberFormatException n){
            System.out.println("NumberFormat Exception: "+n);
        }
        System.out.println("Continue execution");
    }
}
