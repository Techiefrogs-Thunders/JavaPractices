package opsConcept.Inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Choclate c=new Choclate();
        c.delicious();
        
    }
}

interface Farmer{
    static void work(){
System.out.println("farmer work");
    }
    static void pay(){
        System.out.println("former pay");
    }
}
interface Fresh{
    static void work(){
        System.out.println("fresh work");
            }
    static void pay(){
        System.out.println("fresh pay");
    }

}

class Choclate implements Farmer, Fresh{

public void delicious (){
    System.out.println("choclate factory");
}
void work(){
    System.out.println("farmer work");
        }
        void pay(){
            System.out.println("former pay");
        }
Fresh.super.work();
fresh.super.pay();
work.super.work();
work.super.pay();
}