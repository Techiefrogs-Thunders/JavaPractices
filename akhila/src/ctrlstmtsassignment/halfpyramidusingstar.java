package ctrlstmtsassignment;

public class halfpyramidusingstar {
    void meth1()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        new halfpyramidusingstar().meth1();
    }
}
