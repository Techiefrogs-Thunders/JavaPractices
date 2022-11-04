public class car extends abstraction{
    
    public void run()
    {
        int run=700;
        System.out.println("the milage of the car is : "+run);
    }
    
    public void model()
    {
        int model=100;
        System.out.println("the model of the car is : "+model);
    }
    
    public static void main(String[] args) {
        new car().run();
        new car().model();
    }
    
}
abstract public class abstraction {
    public abstract void run();
    public abstract void model();
 }
