public class Palindrome {
    void palindeome()
    {
        int a=12321,r,rev=0,temp;
        temp=a;
        while(a>0)
        {
            r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        if(temp==rev)
        {
        System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }
    }
    public static void main(String[] args) {
        new Palindrome().palindeome();
    }
}
