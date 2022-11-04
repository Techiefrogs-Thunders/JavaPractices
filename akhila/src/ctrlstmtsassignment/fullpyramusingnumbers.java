package ctrlstmtsassignment;

public class fullpyramusingnumbers {
    void meth1()
    {
        int n=10;
        int x,y;
        x=y=0;
        for(int i=1;i<=5;i++)
        {
            y=i;
            for(int j=1;j<=i;j++)
             System.out.print(y++);
            
            x=y-2;
            for(int k=1;k<i;k++)
            System.out.print(x--);
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        new fullpyramusingnumbers().meth1();
    }
}
