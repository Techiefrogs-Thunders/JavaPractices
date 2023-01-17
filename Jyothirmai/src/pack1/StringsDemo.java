package pack1;

public class StringsDemo {

    //String str = "123";
    public static void main(String[] args) {
        StringsDemo obj = new StringsDemo();
        String str = "Hello jyothirmai Team";
        String str2 = "Good morning";
        int a = 20;
        String s2 = String.valueOf(a);
        String str3 = new String("adc21");
        String s1 = str.substring(6);
        System.out.println(s1);
        System.out.println(str.substring(0, 5));
        System.out.println(str.trim());
        System.out.println(str.startsWith("He"));
        System.out.println(str.endsWith("am"));
        System.out.println(str.charAt(10));
        System.out.println(str.length());
        System.out.println(s2+10);
        System.out.println(str.replace("Hello", "Java"));
        //System.out.println(str.compareTo(str3));
        //str = str.concat("Hello");
        //str = "Hellow";
        //System.out.println(str3.equals(str2));
        //System.out.println(str2.equalsIgnoreCase(str3));
        //System.out.println(str3==str2);
        //System.out.println(str==str2);
        //System.out.println(str2);
        //System.out.println(str3);
    }
}
