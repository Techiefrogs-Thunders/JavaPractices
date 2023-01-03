package pack1;

public class StaticNestedClass {
    int i;
    String name;
    static int j;
    class nestedclass{
        public static void main(String[] args) {
            
        }
    }
    void display(){
        System.out.println("In display");
    }

    static void staticmethod(){
        System.out.println("In static method");
    }

    static class Staticinner{
        int k;
        static String str;

        void innerdisplay(){
            System.out.println("In inner display");
        }

        static void innerstatic(){
            System.out.println("In inner static");
        }
        public static void main(String[] args) {
            Staticinner obj = new Staticinner();
            obj.innerdisplay();
            Staticinner.innerstatic();
        }
    }
    public static void main(String[] args) {
        Staticinner.innerstatic();

        Staticinner obj = new Staticinner();
        obj.innerdisplay();
    }
}
