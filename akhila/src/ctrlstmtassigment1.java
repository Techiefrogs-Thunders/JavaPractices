

public class ctrlstmtassigment1 {
    int a=10;
    int b=5;
    void sum()
    {       
        System.out.println(a+b);
    }
    void sumofnatural1()
    {
        int n=10,sum=0,i=1;
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("the sum of "+n+" natural numbers is : "+sum);
    }
    void sumofnatural2()
    {
        int n=9,sum=0,i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("the sum of "+n+" natural numbers is : "+sum);
    }
    void mul()
    {
        int n=9,i=1,mul;
        while(i<=n){
            mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
            i++;
        }
    }
    void gcd()
    {
        int a=28,b=4; 
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println(b);

    }
    void lcm()
    {
        int a=6,b=45,lcm;
        lcm=(a>b)?a:b;
        while(true)
        {
            if(lcm%a==0&&lcm%b==0)
            {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }
    }
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
    void div()
    {
        System.out.println("the quotient of a by b : "+(a/b));
        System.out.println("The remainder of a by b : "+(a%b));
    }
    void swap()
    {
        int temp;
        System.out.println(a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
    void largest()
    {
        int a=3,b=6,c=4;
        if(a>b&&a>c)
        {
            System.out.println(a+" is largest ");
        }
        else if(b>c){
            System.out.println(b+" is largest");
        }
        else
        {
            System.out.println(c+" is largest");
        }
    }
    public static void main(String[] args) {
        new ctrlstmtassigment1().sum();
        new ctrlstmtassigment1().div();
        new ctrlstmtassigment1().swap();
        new ctrlstmtassigment1().largest();
        new ctrlstmtassigment1().sumofnatural1();
        new ctrlstmtassigment1().sumofnatural2();
        new ctrlstmtassigment1().mul();
        new ctrlstmtassigment1().gcd();
        new ctrlstmtassigment1().lcm();
        new ctrlstmtassigment1().prime();
    }
}
