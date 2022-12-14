package Multithreading;

public class Synchro {
    synchronized void display(){
        for(int i=1;i<=5;i++){
            System.out.println(5*i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("This is synchronization block");
    synchronized(this){
        for(int i=1;i<=5;i++){
            System.out.println(5*i);
        }
    }}
    synchronized static void show(){
        for(int i=1;i<=5;i++){
            System.out.print("executed ");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
    }
    public static void main(String[] args) {
        Synchro syn =new Synchro();
        syn.display();
        show();
    }
}
