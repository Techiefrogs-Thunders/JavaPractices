package pack1;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int b = 0;
        //System.out.println(a/b);
        String s = "XYZ";
        try{
            int a = Integer.parseInt(s);
            System.out.println(a);
        }catch(NumberFormatException EX){
            s = "123";
            int a = Integer.parseInt(s);
            System.out.println(a);
        }finally{
            System.out.println("In finally");
        }
        System.out.println("rest of the code");

        validdate(15);
    }

    static void validdate(int age){
        if(age < 18){
            throw new ArithmeticException("not eligible to vote");
        }else{
            System.out.println("eligible to vote");
        }
    }
}
