package opsConcept.Inheritance;

public class HybridInheri {
    public static void main(String[] args) {
         // Son object
         Son s = new Son();
         Son s1=new Son();
         s.land();// Grand father method
         s.Car(); // Father method
         s1.home();// Father method
         s1.mobile();// son method
         
         // Daughter object
         Daughter d = new Daughter();
         Daughter d1=new Daughter();
         d.land();// Grand father method
         d.Car(); // Father method
         d1.home();// Father method
         d1.purse();// son method
        
    }
}
    
class GradFater {

        public void land() {
            System.out.println("GradFater's land");
        }
    
}
    
class Father extends GradFater {
    
        public void home() {
            System.out.println("Father's home");
        }
    
        public void Car() {
            System.out.println("Father's Car");
        }
    }
    
class Son extends Father {

            Son() {
            System.out.println("Son...");
        }
    
        public void mobile() {
            System.out.println("Son's mobile");
        }
}
    
class Daughter extends Father {
    
        public Daughter() {
            System.out.println("Daughter...");
        }
    
        public void purse() {
            System.out.println("Daughter's purse");
        }
}
