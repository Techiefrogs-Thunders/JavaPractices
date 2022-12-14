package Multithreading;

public class Multi implements Runnable{
    public void run(){
        System.out.println("In run method");
    }
    public static void main(String[] args) {
        Multi m=new Multi();
        m.run();
        Thread th=new Thread(m);//using the constructor Thread(Runnable r)
        th.start();
        
    }
}
