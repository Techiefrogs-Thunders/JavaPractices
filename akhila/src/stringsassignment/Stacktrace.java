package stringsassignment;
import java.io.*;
public class Stacktrace {
    public static void main(String[] args) {
        try{
            int division=4/0;
        }
        catch(ArithmeticException e){
            StringWriter sw=new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString=sw.toString();
            System.out.println(exceptionAsString);
        }
    }
}
