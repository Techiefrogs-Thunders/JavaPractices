package Abstraction;

abstract class Animals {
    public abstract void cats();
    public abstract void dogs();

}

class Cats extends Animals{
    @Override
    public void cats() {
        System.out.println("Cats Meow Meow!!!");
    }

    @Override
    public void dogs() {

    }
}

class Dogs extends Animals{
    @Override
    public void cats() {

    }

    @Override
    public void dogs() {
        System.out.println("Dogs Bark Bark!!!");
    }
}

public class Abstraction5 {
    public static void main(String[] args) {
        Cats cat=new Cats();
        cat.cats();
        System.out.println("  ");
        Dogs dog=new Dogs();
        dog.dogs();
    }
}
