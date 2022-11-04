package ctrlstmtsassignment;

public class lcm {
    void meth1()
    {
        int a=120,b=80;
        int lcm;
        lcm=(a>b)?a:b;
        while(true)
        {
            if(lcm%a==0&&lcm%b==0)
            {
                System.out.println("The lcm of "+a+" and "+b+" is "+lcm);
                break;
            }
            ++lcm;
        }
    }
    public static void main(String[] args) {
        new lcm().meth1();
    }
}
