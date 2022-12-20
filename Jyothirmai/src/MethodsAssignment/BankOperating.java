package MethodsAssignment;
public class BankOperating {
    public static void main(String[] args) {
        SBI obj = new SBI();
        ICICI obj1 = new ICICI();
        PNB obj2 = new PNB();
        Customer obj3 = new Customer();
        Account obj4 = new Account();
        RBI obj5 = new RBI();
        obj.sbi();
        obj1.icici();
        obj2.pnb();
        obj3.customer();
        obj4.account();
        obj5.rbi();
        
    }
}
class Customer{
    void customer(){
        String name = "Jyothirmai"; 
        System.out.println("Customer name is: "+name);
    }

}
class Account extends Customer{
    void account(){
        //super.customer();
        Long num = 384752983465l;
        System.out.println("Customer Account Num is: "+num);
    }

}
class RBI extends Account{
    void rbi(){
        //super.account();
        int interest = 4;
        int balance = 500;
        int withdrawal = 100000;
        System.out.println("minimum intrest rate is: "+interest);
        System.out.println("minimum balance allowed: "+balance);
        System.out.println("maximum withdrawal limit is: "+withdrawal);
    }

}
class SBI extends RBI{
    void sbi(){
        //super.rbi();
        System.out.println("In SBI");
    }

}
class ICICI extends RBI{
    void icici(){
        //super.rbi();
        System.out.println("In ICICI");
    }

}
class PNB extends RBI{
    void pnb(){
        //super.rbi();
        System.out.println("In PNB");
    }

}