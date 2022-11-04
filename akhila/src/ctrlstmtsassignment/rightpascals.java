package ctrlstmtsassignment;

public class rightpascals {
   void meth1()
   {
    int i,j,n=8;
    for(i=0;i<=n-1;i++)
    {
        for(j=0;j<=i-1;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println("");
    }
    for(i=n-1;i>=0;i--)
    {
        for(j=0;j<i-1;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println(" ");
    }
   } 
   public static void main(String[] args) {
    new rightpascals().meth1();
   }
}
