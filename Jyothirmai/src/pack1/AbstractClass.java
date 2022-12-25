package pack1;

abstract public class AbstractClass {
    int k = 30;
    String name = "jyothi";

    abstract void display();
    void newDisplay(){
        System.out.println("In instance method");
    }
    static void staticMethod(){
        System.out.println("In static method");
    }

    final void finalmethod(){
        System.out.println("In final method");
    }
    AbstractClass(){
        System.out.println("In abstract class constructor");
    }

    //public static void main(String[] args) {
        //AbstractClass abs = new AbstractClass();
        
    //}
    
}
class DriveClass extends AbstractClass {
    public static void main(String[] args) {
        DriveClass driver = new DriveClass();
        driver.display();
        driver.finalmethod();
        System.out.println(driver.k+"  "+driver.name);
    } 

    void display() {
        System.out.println("Implementation of abstract method");
        
    }
}
