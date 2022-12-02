package stringsassignment;
import java.nio.charset.Charset;
import java.util.*;
public class Basic {
    static String getString(int n){
        byte[] array=new byte[256];
        new Random().nextBytes(array);
        String randomString=new String(array,Charset.forName("UTF-8"));
        StringBuilder r=new StringBuilder();
        for(int i=0;i<randomString.length();i++){
            char ch=randomString.charAt(i);
            if(((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'))&&(n>0)){
                r.append(ch);
                n--;
            }
        }
        return r.toString();
    }
    public static void main(String[] args) {
       int n=20;
       System.out.println(getString(n));
    }
}
