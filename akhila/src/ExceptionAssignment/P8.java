package ExceptionAssignment;

public class P8 extends SuperP8{
    void msg() throws ArithmeticException{
        System.out.println("child method");
    }
    public static void main(String[] args) {
        P8 p=new P8();
        p.msg();
    }
}
class SuperP8{
    void msg() {
        System.out.println("parent method");
    }
}