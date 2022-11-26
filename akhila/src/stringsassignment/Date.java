package stringsassignment;
import java.text.SimpleDateFormat;

public class Date {
    
    public static void main(String[] args)throws Exception{
        String str="23 11 2022";
        SimpleDateFormat formatter=new SimpleDateFormat("dd-mm-yyyy");
        java.util.Date d1=formatter.parse(str);
        System.out.println(str+"\t"+d1);
    }
}
