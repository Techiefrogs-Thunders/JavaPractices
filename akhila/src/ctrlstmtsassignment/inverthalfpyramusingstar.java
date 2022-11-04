package ctrlstmtsassignment;

public class inverthalfpyramusingstar {
    void meth1()
    {
        int n=5;
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        new inverthalfpyramusingstar().meth1();
    }
}
