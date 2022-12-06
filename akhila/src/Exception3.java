public class Exception3 {
    static void n(){
        m();
    }
    static void m(){
        int a=5;
        int b=0;
        System.out.println(a/b);
        throw new ArithmeticException("by zero");
    }
    public static void main(String[] args) {
        try{
            m();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
