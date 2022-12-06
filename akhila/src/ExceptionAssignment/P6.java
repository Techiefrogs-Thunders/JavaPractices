package ExceptionAssignment;

public class P6 {
    public static void main(String[] args) {
        try{
            System.out.println("1st try");
            try{
                System.out.println("2nd try");
            }
            catch(Exception e2){
                System.out.println(e2);
            }
        }
        catch(Exception e1){
            System.out.println(e1);
        }
        
    }
}
