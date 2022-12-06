public class Exceptionhandling {
    static void n(){
        m();
    }
    static void m(){
        int a=5;
        int b=0;
        System.out.println(a/b);
        throw new ArithmeticException("Arithmetic Exception by zero");
    }
    public static void main(String[] args) {
        try{
            System.out.println("start");
            n();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
