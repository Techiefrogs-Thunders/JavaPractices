package arrays;

public class Multiplication {
    void multiply()
    {
        int a[][]={{1,2,3},{2,3,4},{3,4,5}};
        int b[][]={{2,3,4},{4,5,6},{6,7,8}};
        int c[][]=new int[5][5];
        int i,j;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                c[i][j]=0;
                for(int k=0;k<a.length;k++)
                {
                c[i][j]=a[i][k]*b[k][j];  
                } 
                System.out.print(c[i][j]+" ");         
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        Multiplication product=new Multiplication();
        product.multiply();
    }
    
}
