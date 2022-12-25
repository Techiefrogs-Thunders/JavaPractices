package AbstractAssignment;

public class Assignment2 {
    public static void main(String[] args) {
        BankA obj = new BankA();
        BankB obj1 = new BankB();
        BankC obj2 = new BankC();
        obj.getBalance();
        obj1.getBalance();
        obj2.getBalance();
        
    }
}
abstract class Bank{
    abstract void getBalance();
}
class BankA extends Bank{
    void getBalance(){
        System.out.println("deposited $100 in BankA");
    }
}
class BankB extends BankA{
    void getBalance(){
        System.out.println("deposited $150 in BankB");
    }
}
class BankC extends BankB{
    void getBalance(){
        System.out.println("deposited $200 in BankC");
    }
}
