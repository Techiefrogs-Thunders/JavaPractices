package Multithreading;

public class Multithreading extends Thread{
     public static void main(String[] args) {
        Multithreading mt= new Multithreading();
        Multithreading mt1=new Multithreading();
        mt.start();//we are starting the thread here
        //mt.run();//used to do the action
        try{
         Thread.sleep(500);//sleeps a thread for a specified time
         Thread.currentThread();//returns reference to the current thread obj

         //mt.join();
         //mt.join( 999999999);
         mt.join(999999,9999);
         System.out.println("waiting for quite time");
         System.out.println(mt1.getPriority());//returns the priority of the thread
         mt1.setPriority(Thread.MIN_PRIORITY);//FOR MIN priority//used to change the thread's priority
         mt1.setPriority(Thread.MAX_PRIORITY);//for maximum priority
         mt1.setPriority(Thread.NORM_PRIORITY);//FOR normal priority
         System.out.println(mt.getName());//returns name
        mt.setName("akhila");//changesnthe name of the thread
        System.out.println(mt.getName());
         System.out.println(mt.getId());//returns id
         System.out.println(mt.isAlive());//tests if the thread is alive
         Thread.yield();//causing currently executing threads to pause and let other to execute temporarily
         mt.suspend();//used to suspend the thread
         mt.resume();//used to resume the suspended thread
         mt.stop();
         //mt.destroy();//getting an error
         System.out.println(mt.getState());
         System.out.println(mt1.isDaemon());//checks whether the thread is daemon thread or not
         mt1.setDaemon(true);//marks the thread as daemon or not( true / false)
         System.out.println(mt1.getState());
         mt1.start();
         System.out.println(mt1.getState());
         mt1.interrupt();//interrupts the thread
         System.out.println(mt1.getState());//gets the state of the thread
         System.out.println(Thread.interrupted());//checks whether the current thread is interrupted or not
         //isinterrupted() is not possible here- it checks whether has been interrupted or not
         System.out.println(mt1.activeCount());
         mt1.checkAccess();//determines if the currently running has permission to modify the thread
         System.out.println(mt1.getName());
         //mt1.holdLock();

      }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
     }
     
   
   public void run(){
        System.out.println("In run method");
     }
}
//public final void join()
//public final void join(long millis)
//public final void join(long millis,long nanos)
// when th