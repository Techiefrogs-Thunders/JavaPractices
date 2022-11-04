package ctrlstmtsassignment;

public class gcd {
    void meth1()
    {
        int a=20,b=30;
        int gcd=1;
        for(int i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("The gcd of "+a+" and "+b+" is "+gcd);
    }
    public static void main(String[] args) {
        new gcd().meth1();
    }
}
