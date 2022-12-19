package BasicAssignments;

public class Assignment27 {
    public static void main(String[] args) {
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
}
    
