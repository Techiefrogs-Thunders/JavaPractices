package ctrlstmtsassignment;

public class prime {
    void meth1()
    {
        int n=1;
        int flag,check;
        while(n<=100)
        {
            check=2;
            flag=0;
       while(check<=n/2) 
       {
        if(n%check==0)
        {
            flag++;
            break;
        }
        check++;
       }
       if(flag==0&&n!=1)
       {
        System.out.print(n+" ");
       }
       n++;
    }
    }
    public static void main(String[] args) {
        new prime().meth1();
    }
}
