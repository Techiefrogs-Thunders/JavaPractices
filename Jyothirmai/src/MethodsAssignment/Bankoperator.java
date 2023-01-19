package MethodsAssignment;

public class Bankoperator {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        sbi.P=5.876;
        sbi.r=7.42;
        sbi.n= 5;
        sbi.t=7;
        //System.out.println("sbi intrestrste is : "+sbi.setInterestRate());
        System.out.println("sbi withdrawal limit is : "+sbi.setWithdrawalLimit());
        System.out.println("icici intrestrate is : "+icici.setInterestRate());
        System.out.println("icici withdrawal limit is : "+icici.setWithdrawalLimit());
        //System.out.println("rbi intrest rate is : "+rbi.setInterestRate());
        //System.out.println("rbi withdrawal limit is : "+rbi.setWithdrawalLimit());
    }
}
class Customer{
    void customer(){
        System.out.println();
    }

}
class Account {
    String acctype = "SAVINGS";
    void account(){
        System.out.println(acctype);
    }

}
class RBI {
    int withlimit,n;
    double A,P,r;
    float t;
    long avg,tot,mb;
    String acctype;
    String branchtype;
    int setWithdrawalLimit(){
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
        A = (P+r)/n*t;
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
