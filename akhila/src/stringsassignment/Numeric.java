package stringsassignment;
import java.util.*;
public class Numeric {
    public static boolean numeric(String str){
        if(str==null)
            return false;
        for(char c:str.toCharArray())
            if(c<'0'||c>'9')
                return false;
            
        return true;
    }
        
    
    public static void main(String[] args) {
        //Numeric n=new Numeric();
        System.out.println(numeric("1gfjjhgjhjyf2"));
    }
}
