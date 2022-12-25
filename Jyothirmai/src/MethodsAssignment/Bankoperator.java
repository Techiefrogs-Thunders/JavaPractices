package MethodsAssignment;
import java.util.*;

public class Bankoperator {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        Customer customer = new Customer();
        sbi.P=10.433;
        sbi.r=7.42;
        sbi.n= 5;
        sbi.t=7;
        Double sbiInt = sbi.setInterestRate();
        System.out.println("SBI interest rate is: "+sbiInt);
        int iciciWL = icici.setWithdrawalLimit();
        System.out.println("ICICI withdraw limit is: "+iciciWL);
        
    }
}
class Customer{
    void customer(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String address = sc.nextLine();
        int age = sc.nextInt();
    }

}
class Account {
    void account(){
        String accaType,branchType;
    }

}
class RBI {
    int withlimit,n;
    double A,P,r;
    float t;
    long avg,tot,mb;
    int setWithdrawalLimit(){
        Scanner sc = new Scanner(System.in);
        String acctype = sc.nextLine();
        String branchtype = sc.nextLine();
        if(acctype=="SAVINGS" && branchtype=="METRO"){
            withlimit = 5000;
        } 
        else{
            withlimit = 4000;
        }
        return withlimit;

        }
        double setInterestRate(){
            A = (P+r)/n*t;
            return A;
        }
        long setMAB(){
            mb=(avg*tot)/31;
            return mb;
        }
    }
class SBI extends RBI{
    double setInterestRate(){
        A = P*(1+r/n)+n*t;
        return A;
    }
    long setMAB(){
        mb = (avg+tot)/30;
        return mb;
    }

}
class ICICI extends RBI{
    double setInterestRate(){
        A = (P*r)/n+t;
        return A;
    }
    int setWithdrawalLimit(){
        withlimit = 7000;
        return withlimit;
    }

}
