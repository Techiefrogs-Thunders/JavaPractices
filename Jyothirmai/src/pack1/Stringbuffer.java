package pack1;

public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("good evening all");
        str.ensureCapacity(50);
        System.out.println(str+ "  "+str.capacity());

        str.insert(4, ". Welcome");
        str.replace(0, 5, "eagles");
        System.out.println(str+"  "+str.capacity());

        StringBuffer str1 = new StringBuffer("Welcome");
        System.out.println(str1+ "  "+str1.capacity());
        
        StringBuffer str2 = new StringBuffer(20);
        System.out.println(str2+"  "+str2.capacity());
    }
}
