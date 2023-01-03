package pack1;

public class StringsDemo {

    //String str = "123";
    public static void main(String[] args) {
        StringsDemo obj = new StringsDemo();
        String str = "837456";
        String str2 = "837456";

        String str3 = new String("837456");
        str = str.concat("Hello");
        //str = "Hellow";
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}
