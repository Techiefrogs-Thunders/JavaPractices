package Statements;

public class NestedIf {
    public static void main(String[] args) {
        int a=29;
        if (a<=29) {
            if (a!=29) {
                if (a!=10) {
                    System.out.println(a);   
                }

                System.out.println("true");
            }
            else{
                if (a==20) {
                    System.out.println("in else"+ a);
                }
            System.out.println("false");

            }
        System.out.println("invalid");

        }
    }
    
}
