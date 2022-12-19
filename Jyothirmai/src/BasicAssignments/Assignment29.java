package BasicAssignments;

public class Assignment29 {
    public static void main(String[] args) {
        int n=10,i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--)
        {
            for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(k=i;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   
    }