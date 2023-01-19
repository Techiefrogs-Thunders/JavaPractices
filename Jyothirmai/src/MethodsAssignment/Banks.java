package MethodsAssignment;

public class Banks  {
    public static void main(String[] args) {
        BankA money = new BankA();
        BankB money1 =new BankB();
        BankC money2=new BankC();
        System.out.println("BankA : "+money.getBalance());
        System.out.println("BankB : "+money1.getBalance());
        System.out.println("BankC : "+money2.getBalance());
       
        
    }
}
class Bank{
    int  getBalance(){
        return 0;
      }
}
class BankA{
    int getBalance(){
        return 1000;
    }

}
class BankB{
    int getBalance(){
        return 1500;
    }

}
class BankC{
    int getBalance(){
        return 2000;
    }

}
