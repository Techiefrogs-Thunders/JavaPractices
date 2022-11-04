package ctrlstmtsassignment;

public class sumofnaturals {
    void meth1()
    {
        int n=10,i=1,sum=0;
        while(i<=n){
           sum=sum+i;
           i++;
        }
        System.out.println("The sum of "+n+" natural numbers is "+sum);
    }
    public static void main(String[] args) {
        new sumofnaturals().meth1();
    }
}
