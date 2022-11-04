package basicPro;

import java.util.jar.Attributes.Name;

public class LocalVariabel {

    static int i=5;
    public static void main(String[] args) {

        String name="phone";
        boolean queen=true;
        System.out.println(name+"   "+queen); 
        firstMethod(); 
        switchChar();
        secondMethod();
}
    public static void firstMethod(){
        char c='a';
        System.out.println(c);
        System.out.println(i);
        switch (i) {
            case 5: System.out.println("try to print 20"); 
            case 19: System.out.println("print wrong"); 
            case 'a': System.out.println("print A");break;
            default: System.out.println("nothing eligible"); break;
        }
    }
    public static void switchChar() {
        char c1='e';
        switch (c1) {
            case 'a': System.out.println("print A");break;
            case 'b': System.out.println("print B");
            case 'e': System.out.println("print E"); 
            case 'c': System.out.println("print C");break;
            case 'd': System.out.println("print D");        
            default:System.out.println("wrong char");break;
        }
    }
public static void secondMethod() {
    byte b=2;
    while (b<=3) {
         for (byte a=1; a<=i; a++) {
            System.out.println(a);
            if (a>=b) {
                System.out.println("if condition passed in for and while");  
            } 
            else {
                System.out.println("if condition not passed in for and while");
            }    
        }  
        System.out.println(b); break;
  }
    System.out.println("while functionality not worked");
    
}
}
