class Electronics {
    public Electronics(){
        System.out.println("Class Electronics");
    }
    public void deviceType() {
        System.out.println("Device Type: Electronics");
    }
}
class Grinder extends Electronics {
    Grinder() {
        System.out.println("Class Grinder");
    }
    public void category() {
        System.out.println("Category - Grinder");
    }
    
}
class WetGrinder extends Grinder {
    WetGrinder() {
        System.out.println("Class WetGrinder");
    }
    public void grindingTech() {
        System.out.println("Grinding Technology- WetGrinder");
    }
}
public class Inheritance3 {
    public static void main(String[] arguments) {
        WetGrinder gr= new WetGrinder();
        gr.deviceType();
        gr.category();
        gr.grindingTech();
    }
}