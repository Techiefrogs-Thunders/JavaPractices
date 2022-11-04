package ctrlstmtsassignment;

public class invertfullpyrampatternusingstar {
    void meth1()
    {
        int n=8;
        int i,j;
        for(i=n;i>0;i--)
        {
            for(j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<(i*2)-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        new invertfullpyrampatternusingstar().meth1();
    }
}
