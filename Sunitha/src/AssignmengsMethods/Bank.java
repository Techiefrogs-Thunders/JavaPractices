package AssignmengsMethods;

public class Bank { //need to ask doubt about variable (scnd and trd deposit default taking as a )
    int a;
   double getBalance(double a){
     a=a;
       System.out.println("Money deposite sucessfully: "+a);
       return a;
    }
    public static void main(String[] args) {
        Bank b=new Bank();
        BankA ba=new BankA();
        BankB bb=new BankB();
        BankC bc=new BankC();
        b.getBalance(0);
        ba.getBalance(1000);
        bb.getBalance(1500);
        bc.getBalance(2000); 
    }   
}

class BankA extends Bank{
    int frstdeposit=1000;
    public void getBalance(int frstdeposit){
        this.frstdeposit=frstdeposit;
        System.out.println("First Money deposite sucessfully: "+frstdeposit);
        //return frstdeposit;
    }
}
class BankB extends Bank{
    long scnddeposit;
    void getBalance(long scnddeposit){
        //this.scnddeposit=scnddeposit;
        System.out.println("Second Money deposite sucessfully: "+scnddeposit);
       // return scnddeposit;
    }

}
class BankC extends Bank{
    long trddeposit;
    void getBalance(long trddeposit){
        this.trddeposit=trddeposit;
        System.out.println("third Money deposite sucessfully: "+trddeposit);
       // return trddeposit;
    }

}
