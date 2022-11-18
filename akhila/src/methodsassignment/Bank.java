package methodsassignment;
import java.util.Scanner;
class Customer
{
    String name,address;
    int age;
}
class Account
{
    String accountType,branchName;
}
class RBI
{
    int withlimit,n;
    int P,r,A,t;
    long avg,tot,mb;
    //mb=minimum amount required to maintain every month
    //withlimit: withdraw limit
    //A:compound interest
    //P:principle
    //r:interest rate
    public double GetWithdrawalLimit()
    {
        Scanner sc=new Scanner(System.in);
        String accounttype=sc.nextLine();
        String branchtype=sc.nextLine();
        if(accounttype=="SAVINGS"&&branchtype=="METRO")
        {
            withlimit=5000;
        }
        else{
            withlimit=4000;
        }
        return withlimit;
        
    }
    public double GetInterestRate()
    {
        A=(P+r)/n*t;
        return A;
    }
    long MB()
    {
        mb=(avg*tot)/31;
        return mb;
    }
}
class SBI extends RBI{
    public double GetInterestRate()
    {
        A=(P+r)/n*t;
        return A;
    }
    long MB()
    {
        mb=(avg*tot)/30;
        return mb;
    }
}
class ICICI extends RBI{
    public double GetInterestRate()
    {
        A=(P+r)/n*t;
        return A;
    }
    public int setWithdrawalLimit()
    {
        int withLimit=7000;
        return withLimit;
    }
}
public class Bank {
    public static void main(String[] args) {
        SBI sbi=new SBI();
        ICICI icici=new ICICI();
        sbi.P=10;
        sbi.r=8;
        sbi.n=5;
        sbi.t=4;
        Double sbiInt=sbi.GetInterestRate();
        System.out.println("SBI interest rate is: "+sbiInt);
        int iciciWL=icici.setWithdrawalLimit();
        System.out.println("The withdrawal amount is: "+iciciWL);
    }
}
