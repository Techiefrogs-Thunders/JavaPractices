package stringsassignment;

public class Contains {
    public static void main(String[] args) {
        String str="I am akhila kakarla";
        //boolean str1=str.contains(null);
        //System.out.println(str1);//we get exception here
        boolean iscontains=str.contains("kakarla");
        System.out.println(str.contains("I"));
        System.out.println(str.contains("am"));
        System.out.println(str.contains("akhila"));
        System.out.println(iscontains);
    }
}
