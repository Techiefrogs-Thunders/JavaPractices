package arrays;
import java.util.Scanner;
public class Multiplication1 {
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    void product()
    {
        int i,j,k;
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
                c[i][j]=0;
                for(k=0;k<3;k++)
                {
                    c[i][j]=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Multiplication1 multiply=new Multiplication1();
        multiply.product();
    }
}
