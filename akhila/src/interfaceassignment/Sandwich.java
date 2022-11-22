package interfaceassignment;

public class Sandwich {
     public void bread()
     {
        System.out.println("Bread() ");
     }
     public void Cheese()
     {
        System.out.println("Cheese() ");
     }
     public void Lettuce()
     {
        System.out.println("Lettuce()");
     }
     public void Pickle()
     {
        System.out.println("Pickle()");
     }
     public static void main(String[] args) {
        Sandwich s=new Sandwich();
        s.bread();
        s.Cheese();
        s.Lettuce();
        s.Pickle();
     }
}
interface Fastfood{
    void bread();
    void cheese();
    void Lettuce();
    void Pickle();
}
