package Abstraction;

abstract class Bank {
    public abstract int getBalance();
}

class BankA extends Bank{
    @Override
    public int getBalance() {
        return 100;
    }
}

class BankB extends Bank{
    @Override
    public int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    @Override
    public int getBalance() {
        return 200;
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        BankA a=new BankA();
        System.out.println("BankA getBalance() returns: $"+a.getBalance());
        BankB b=new BankB();
        System.out.println("BankB getBalance() returns: $"+b.getBalance());
        BankC c=new BankC();
        System.out.println("BankC getBalance() returns: $"+c.getBalance());
    }
}
