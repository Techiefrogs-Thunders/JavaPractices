package methodsassignment;
public class Banks {
    public static void main(String[] args) {
        Bank A=new BankA();
        Bank B=new BankB();
        Bank C=new BankC();
        A.getBalance();
        B.getBalance();
        C.getBalance();
    }
}
abstract class Bank{
    abstract void getBalance();
}
class BankA extends Bank{
    void getBalance()
    {
        System.out.println("Money deposited in the Bank is $1000");
    }
}
class BankB extends Bank{
    void getBalance()
    {
        System.out.println("Money deposited in the bank is $1500");
    }
}
class BankC extends Bank{
    void getBalance()
    {
        System.out.println("Money deposited in the Bank is $2000");
    }
}