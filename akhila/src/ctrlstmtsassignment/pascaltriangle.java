package ctrlstmtsassignment;
public class pascaltriangle {
    void meth1()
    {
        int n=6;
        int i,j;

        for(i=1;i<=n;i++)
        {
            for(j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int c=1;
            for(int k=1;k<=i;k++)
            {
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new pascaltriangle().meth1();
    }
}
