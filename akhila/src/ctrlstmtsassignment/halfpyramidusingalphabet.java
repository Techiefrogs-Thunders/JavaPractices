package ctrlstmtsassignment;

public class halfpyramidusingalphabet {
    void meth1()
    {
        int alphabet=65;
        int n=5;
        int i,j;
        for(i=0;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print((char)(alphabet+(j))+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        new halfpyramidusingalphabet().meth1();
    }
}
