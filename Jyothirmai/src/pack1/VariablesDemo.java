package pack1;

public class VariablesDemo {
    static byte b1;
    static short s1; 
    static int i;
    static long l;
    static float f;
    static double d;
    static char ch;
    public static void main(String[] args) {
        i = 130;
        b1 = (byte)i;
        boolean b = true;
        s1 = 32000;
        l = 3945868376529835l;
        f = 100.10f;
        d = 2348.765;
        ch = 75;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
    }
}
