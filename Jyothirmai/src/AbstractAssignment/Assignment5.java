package AbstractAssignment;

public class Assignment5 {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();
        cat.cats();
        dog.dogs();
    }
}
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){
        System.out.println();
    }
}
class Dogs extends Animals{
    void dogs(){
        System.out.println("Dogs bark");
    }
    void cats(){
        System.out.println();
    }
}
