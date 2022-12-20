package methodsassignment;
public class Banks {
    public static void main(String[] args) {
        BankA A=new BankA();
        BankB B=new BankB();
        BankC C=new BankC();
        System.out.println(A.getBalance());
        System.out.println(B.getBalance());
        System.out.println(C.getBalance());
    }
}
 class Bank{
    int getBalance(){
        return 0;
    }
}
class BankA extends Bank{
    int getBalance()
    {
        return 1000;
    }
}
class BankB extends Bank{
    int getBalance()
    {
        return 1500;
    }
}
class BankC extends Bank{
    int  getBalance()
    {
        return 2000;
    }
}