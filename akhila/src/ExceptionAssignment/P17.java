package ExceptionAssignment;

public class P17 {
    public static void main(String[] args) throws IllegalAccessException {
        try{
            Class<Boolean> b=boolean.class;
            b.newInstance();
        }  
        catch(InstantiationException i){
            System.out.println(i);
        }
        catch(IllegalAccessException iae){
            System.out.println(iae);
        }
    }
}
