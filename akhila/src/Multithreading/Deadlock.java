package Multithreading;

public class Deadlock extends Thread{
    public static void main(String[] args) {
        String a="akhila";
        String b="kakarla";
        Thread t1=new Thread(){
            public void run(){
                synchronized(a){
                    System.out.println("Thread1 : locked resource");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
            
            synchronized(b){
                try{
                    Thread.sleep(150);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        };
        Thread t2=new Thread(){
            public void run(){
                synchronized(a){
                    System.out.println("Thread1 : locked resource");
                    try{
                        Thread.sleep(100);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
            
            synchronized(b){
                try{
                    Thread.sleep(150);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
        };
        t1.start();
        t2.start();
    }
}
