package MethodsAssignment;

public class Banks  {
    public static void main(String[] args) {
        Bank money = new BankA();
        Bank money1 =new BankB();
        Bank money2=new BankC();
        System.out.println(money.getBalance());
        System.out.println(money1.getBalance());
        System.out.println(money2.getBalance());
       
        
    }
}
class Bank{
    int  getBalance(){
        return 0;
      }
}
class BankA extends Bank{
    int getBalance(){
        return 1000;
    }

}
class BankB extends Bank{
    int getBalance(){
        return 1500;
    }

}
class BankC extends Bank{
    int getBalance(){
        return 2000;
    }

}
