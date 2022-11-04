package ctrlstmtsassignment;

public class floydstriangle {
    void meth1()
    {
        int n=4;
        int i,j,k=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        new floydstriangle().meth1();
    }   
}
