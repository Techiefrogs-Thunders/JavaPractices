package inheritance;

public class Multilevelinheritance extends Maruti{
    void model()
    {
        System.out.println("Model type : 800");
    }
    void speed()
    {
        System.out.println("maximum speed : 80Kmph");
    }
    public static void main(String[] args) {
        Multilevelinheritance multi=new Multilevelinheritance();
        multi.vehicletype();
        multi.brand();
        multi.speed();
        multi.model();
        multi.speed();
    }
}
class Maruti extends Car{
    void brand()
    {
        System.out.println(" Brand : maruti");
    }
    void speed()
    {
        System.out.println("speed of the car is : 90Kmph");
    }

}
class Car{
    //constructors doesnot participate in inheritance   
    public void vehicletype()
    {
        System.out.println("vehicle type : car");
    }
}