package arrays;
import java.util.Scanner;
public class Addition1 {
    static int a[][]=new int[3][3];
    static int b[][]=new int[3][3];
    static int c[][]=new int[3][3];
    void sum()
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        Addition1 add=new Addition1();
        add.sum();
    }
}
