package ctrlstmtsassignment;

public class leftpascals {
    void meth1()
    {
        int i,j,k,n=10;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=n;i>=1;i--)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        new leftpascals().meth1();
    }
}
