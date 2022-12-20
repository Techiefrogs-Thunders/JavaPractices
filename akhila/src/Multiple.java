public class Multiple {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        a.travel();
    }
}
interface AnimalEat
{
    void eat();
}
interface AnimalTravel
{
    void travel();
}
class Animal implements AnimalEat,AnimalTravel
{
    @Override
    public void travel() {
        System.out.println("Animal is travelling");
        
    }
    
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Animal is eating");
        
    }
}