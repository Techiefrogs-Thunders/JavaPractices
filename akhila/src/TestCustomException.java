import java.io.IOException;

public class TestCustomException extends Exception{
    void display() {
        System.out.println("TestExceptionChild");
    }
    public static void main(String[] args)  {
        Parent p=new Parent();
        p.display();
        TestCustomException test=new TestCustomException();
        test.display();
    }
}
class Parent{
    void display()  {
        System.out.println("parent method");
    }
}