package pack1;

public class Inhertance extends child{

    Inhertance(){
        super();
        System.out.println("in inheritance constructor");
    }

    void Display(){
        super.Display();
        System.out.println("in inheritance class");
    }
    public static void main(String[] args) {
        Inhertance obj=new Inhertance();
        //obj.Display();
        obj.Display1();
        obj.Display();
    }

}
class child extends child2{
    int i = 3049;
    int j = 93486;
    child(){
        super();
        System.out.println("in chils constructor");

    }
    void Display(){
        //super();
        System.out.println("in child class");
    }

}
class child2{
    int i = 83274;
    int j = 83746;
    child2(){
        System.out.println("in child2 constructor");
    }
    void Display1(){
       // super();
        System.out.println("in child1 class");
    }
}