package stringsassignment;

public class Twelve {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer();
        s.append("java ");
        s.append("is ");
        s.append("awesome");
        System.out.println(s);
        s=new StringBuffer();
        //s.setLength(0);
        //s.delete(0,s.length());
        System.out.println(s);
        System.out.println("String is cleared");
    }
}
