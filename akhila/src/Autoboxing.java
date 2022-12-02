public class Autoboxing {
    public static void main(String[] args) {
        int i=5;
        Integer I1=Integer.valueOf(i);
        Integer I2=i;
        System.out.println(i);
        System.out.println(I1);
        System.out.println(I2);
        char ch='a';
        Character CH1=Character.valueOf(ch);
        Character CH2=Character.valueOf(ch);
        System.out.println(ch);
        System.out.println(CH1);
        System.out.println(CH2);
        byte b=5;
        Byte B1=Byte.valueOf(b);
        Byte B2=Byte.valueOf(b);
        System.out.println(b);
        System.out.println(B1);
        System.out.println(B2);
        boolean bool=true;
        Boolean Bool1=Boolean.valueOf(bool);
        Boolean Bool2=bool;
        System.out.println(bool);
        System.out.println(Bool1);
        System.out.println(Bool2);
    }
}
