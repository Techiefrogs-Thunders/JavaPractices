public class App {
    void prime()
    {
        int n=3,i,flag=0;
        int m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else{
            for(i=1;i<=m;i++)
            {
                if(m%i==0)
                {
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println(n+" is a prime number");
        }
    }
    
    public static void main(String[] args) {
        new App().prime();
    }
}
