public class StaticVariable2 {
    static String var="Srivatsav";
	
    public static void main(String args[]){
        StaticVariable2 obj = new StaticVariable2();
        StaticVariable2 obj2 = new StaticVariable2();
        
        System.out.println(obj.var);
        System.out.println(obj2.var);
        System.out.println(StaticVariable2.var);
        System.out.println(StaticVariable2.var);

        StaticVariable2.var = "Lakamsani";

        System.out.println(obj.var);
        System.out.println(StaticVariable2.var);
        System.out.println(StaticVariable2.var);
    }
    
}
