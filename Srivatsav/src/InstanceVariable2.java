public class InstanceVariable2 {
    String Var;
    //static String var = "Static variable";
    public static void main(String args[]){

        InstanceVariable2 obj = new InstanceVariable2();
    
        System.out.println("Calling Method");
        obj.instance();
        System.out.println(obj.Var);
    }
    public void instance(){
        String Var = "Inside Method";
        System.out.println(Var);
    }
}
