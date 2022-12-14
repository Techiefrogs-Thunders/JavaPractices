package Multithreading;

public class Interthread {
    
    public static void main(String[] args) {
        final Test t=new Test();
        new Thread(){
            public void run(){
                t.withdraw(7);
            }
        }.start();
    }
}
class Test{
    int n=5;
    synchronized void withdraw(int n){
        System.out.println("n is "+n);
        if(this.n<n){
            System.out.println("less");
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        this.n+=n;
        System.out.println("n completed");
        notify();
    }
}