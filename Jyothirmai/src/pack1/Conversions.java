package pack1;

public class Conversions {
    public static void main(String[] args) {
        String s = "123";
        int i = Integer.parseInt(s);

        int i1 = Integer.valueOf(s);
        float f = Float.parseFloat(s);
        s = String.format("%d", i1);
        System.out.println(i1+f);
        System.out.println(s+100);
        int i2 = 123;
        String s1 = String.valueOf(i2);
        System.out.println(s1);
        display(i);
    }
    static void display(Integer i){
        System.out.println("from wrapper "+i);
    }
}
