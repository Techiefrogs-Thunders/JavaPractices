package InterfaceAssignment;

public class Sandwich {
    void Biryani(){
        System.out.println("Biryani()");
    }
    void bread(){
        System.out.println("bread()");
    }
    void cake(){
        System.out.println("cake()");
    }
    void chocolate(){
        System.out.println("chocolate()");
    }
    public static void main(String[] args) {
        Sandwich obj = new Sandwich();
        obj.Biryani();
        obj.bread();
        obj.cake();
        obj.chocolate();
    }
}
interface FastFood{
    void Biryani();
    void bread();
    void cake();
    void chocolate();
}
