package pack1;

public class Inhertance extends child{

    void Display(){
        super.Display();
        System.out.println("in inheritance class");
    }
    public static void main(String[] args) {
        Inhertance obj=new Inhertance();
        obj.Display();
    }

}
class child{
    int i = 3049;
    int j = 93486;
    void Display(){
        System.out.println("in child class");
    }

}