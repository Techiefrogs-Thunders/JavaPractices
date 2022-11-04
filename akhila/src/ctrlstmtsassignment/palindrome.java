package ctrlstmtsassignment;

public class palindrome {
    int a=12321;
    void meth1()
    {
        int temp;
        int rev=0;
        temp=a;
        while(a>0)
        {
            rev=rev*10+a%10;
            a=a/10;
        }
        if(rev==temp)
        {
        System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
    public static void main(String[] args) {
        new palindrome().meth1();
    }
}
