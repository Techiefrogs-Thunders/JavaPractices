package stringsassignment;

public class Iterate1 {
    public static void main(String[] args) {
        String str="I am akhila kakarla";
        System.out.println(str.toUpperCase());
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i)+" ");
        }
    }
}
