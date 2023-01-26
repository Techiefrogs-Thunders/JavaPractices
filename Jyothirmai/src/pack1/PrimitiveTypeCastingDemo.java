package pack1;

public class PrimitiveTypeCastingDemo {
    public static void main(String[] args) {
        float f = 1.20f;
        int i = 20;
        double d = f;
        char ch = 'a';
        i = (int)f;
        //i = ch;
        System.out.println(i);
        f = (int)d;

        double k = d*i+f;
        System.out.println(k);
    }
}
