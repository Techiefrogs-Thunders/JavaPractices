package ctrlstmtsassignment;

public class armstrong {
    void meth1()
    {
        int n=153;
        int armstg=0;
        int temp=n;
        while(n>0)
        {
            int rem=n%10;
            armstg=armstg+(rem*rem*rem);
            n=n/10;
        }
        if(temp==armstg)
        {
            System.out.println("It's an armstrong number");
        }
        else{
            System.out.println("It's not an arnstrong number");
        }
    }
    public static void main(String[] args) {
        new armstrong().meth1();
    }
}
