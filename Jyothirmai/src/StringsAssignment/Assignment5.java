package StringsAssignment;

public class Assignment5 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        int i = 20;
        String str = new String("abc");
        String str1 = new String("abc1");
        System.out.println(s1==s2);
        System.out.println(str.equals(s1));
        System.out.println(str.equals(str1));
        System.out.println(String.valueOf(i));
    }
}
