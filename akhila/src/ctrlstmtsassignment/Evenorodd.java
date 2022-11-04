package ctrlstmtsassignment;

public class Evenorodd {
    int n=4;
    void meth1()
    {
        if(n%2==0)
        {
            System.out.println("n is even");
        }
        else{
            System.out.println("n is odd");
        }
    }
    public static void main(String[] args) {
        new Evenorodd().meth1();
    }
}
