package ctrlstmtsassignment;

public class halfpyramidusingnumbers {
    void meth1()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        new halfpyramidusingnumbers().meth1();
    }
}
