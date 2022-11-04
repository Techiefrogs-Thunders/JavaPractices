package ctrlstmtsassignment;

public class fullpyramusingstar {
    void meth1()
    {
        int n=5;
        int i,j;
        int space=n-1;
        int stars=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            for (j=1;j<=stars;j++)
            {
                System.out.print("*\t");
            }
            stars+=2;
            space--;
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        new fullpyramusingstar().meth1();
    }
}
