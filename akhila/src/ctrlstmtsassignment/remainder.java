package ctrlstmtsassignment;

public class remainder {
    int a=15;
    int b=5;
    void meth1()
    {
        System.out.println("The quotient of a and b is "+(a/b));
        System.out.println("The remainder of a and b is "+(a%b));
    }
    public static void main(String[] args) {
        new remainder().meth1();
    }
}
