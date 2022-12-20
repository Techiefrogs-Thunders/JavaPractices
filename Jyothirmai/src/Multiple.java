public class Multiple {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}
interface AnimalEat{
    void eat();
}
interface AnimalTravel{
    void travel();
}
class Animal implements AnimalEat,AnimalTravel{
    @Override
    public void travel(){
        System.out.println("Animal is travelling");
        System.out.println("It is travelling ");
    }

    @Override
    public void eat(){
        System.out.println("Animal is eating");
        System.out.println("It is eating ");
    }
}

