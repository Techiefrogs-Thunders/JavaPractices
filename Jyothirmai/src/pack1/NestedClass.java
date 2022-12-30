package pack1;

public class NestedClass {
    private int i = 10;
    String name = "jyothi";
    static int x = 30;
    void display(){
        i = 500;
        x = 20;
        System.out.println("In display");
        class Localclass{
            int l = 60;
            void localdisplay(){
                System.out.println("In local display");
            }
        }
        Localclass local = new Localclass();
        local.localdisplay();
        System.out.println(local.l);
    }
    NestedClass(){
        System.out.println("In constructor");
    }
    class Myinnerclass{
        int k = 30;
        void innerdisplay(){
            i = 50;
            name = "jfhrg";
            x = 70;
            display();
            System.out.println("In inner display");
        }

        Myinnerclass(){
            System.out.println("In inner constructor");
        }
    }
    public static void main(String[] args) {
        NestedClass Oobj = new NestedClass();
        Myinnerclass Iobj = Oobj.new Myinnerclass();
        Iobj.innerdisplay();
        System.out.println(Iobj.k);
        System.out.println(Oobj.i);
    }
}
