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
                System.out.print((char)(alphabet+(i-1))+" ");// a b b c c c d d d d
                //System.out.println((char)(alphabet+(j))+" ");//a a b a b c a b c d
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        new halfpyramidusingalphabet().meth1();
    }
}
