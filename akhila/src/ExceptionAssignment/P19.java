package ExceptionAssignment;

public class P19 {
    public static void main(String[] args) {
        try{
            Object obj=new Object();
            String s=(String)obj;
            System.out.println(s);
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}
