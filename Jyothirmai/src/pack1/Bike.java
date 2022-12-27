package pack1;

interface Interfaces {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
    void run();
}
public class Bike implements Interfaces{
    public void run() {
        System.out.println("Bike runs");
    }
    
    }