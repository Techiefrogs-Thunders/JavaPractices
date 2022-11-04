package ctrlstmtsassignment;

public class factorial {
    
    void meth1(int n)
    {
        int fact=1,i=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
    public static void main(String[] args) {
        new factorial().meth1(5);
    }
}
