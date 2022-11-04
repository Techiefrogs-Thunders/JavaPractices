package opsConcept.Inheritance;

public class Interface {
    public static void main(String[] args) {
        BlackBerries bb=new BlackBerries();
        bb.healthy();
        bb.nonHealthy();
       // Berries b=new Berries();
            
        };
    }
    // interface can not have constructor and interface  default abstract and public
interface Berries  { //for interface cant not create an object so we need again implete interface with claass
int i=10;
String name="java";
long l=3434343;
    void healthy(){
        
    }
    void nonHealthy();
}

class BlackBerries implements Berries{
   public  void healthy(){
        System.out.println("brightness   " + name);
    }
    public void nonHealthy(){
        System.out.println("darkness " + l);
    }
}
class Rusberries implements Berries{
    public void healthyknown() {
        System.out.println(i);
    }

}

