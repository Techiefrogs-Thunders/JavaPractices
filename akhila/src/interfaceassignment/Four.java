package interfaceassignment;

public class Four implements Animal{
    public void eat(){
        System.out.println("Animals eat");
    }
    public void sleep()
    {
        System.out.println("Animals sleep");
    }
    public static void main(String[] args) {
        Four f=new Four();
        System.out.println("Static variable : "+a);
        f.eat();
        f.sleep();
    }
}
interface Animal{
    static int a=10;
    void eat();
    void sleep();
}