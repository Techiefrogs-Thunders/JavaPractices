package arrays;
public class Jaggedarray {
    void jagged()
    {
        int a[][]=new int[3][];
        a[0]=new int[3];
        a[1]=new int[2];
        a[2]=new int[2];
        int count=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=count;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Jaggedarray array=new Jaggedarray();
            array.jagged();
    }
}
