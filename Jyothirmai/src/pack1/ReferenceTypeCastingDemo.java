package pack1;

import javax.sql.rowset.spi.SyncResolver;

class carnivore{
    void dis(){
        System.out.println("In carnivore");
    }
}

class Animal extends carnivore{
    void eat(){
        System.out.println("In animal eat");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("In dog bark");
    }
    void eat(){
        System.out.println("In dog eat ");
    }
}
 class Cat extends Animal{
    void meow(){
        System.out.println("In cat meow");
    }
 }
public class ReferenceTypeCastingDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        Animal a = d;
        ((Dog)a).bark();
        a.eat();
        carnivore c = d;
        display(d);

        Cat c1 = new Cat();
        Animal a1 = c1;

        if(a instanceof Dog)
        {

            System.out.println("In if");
            ((Dog)a).bark();
        }
    }

    static void display(Animal a){
        System.out.println("In display  "+a);
    }
}
