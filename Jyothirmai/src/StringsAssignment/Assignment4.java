package StringsAssignment;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Assignment4 {
    public static void main(String[] args) {
        try{
            int division = 0/0;
        }
        catch(ArithmeticException e){
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAString = sw.toString();
            System.out.println(exceptionAString);
        }
        }
    }
