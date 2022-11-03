public class InstanceVariable {
    String instanceVar="Instance Variable";
	
    public static void main(String args[]){
        InstanceVariable obj = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
         
        System.out.println(obj.instanceVar);
        System.out.println(obj2.instanceVar);

        obj2.instanceVar = "Random"; 
         
        System.out.println(obj.instanceVar);
        System.out.println(obj2.instanceVar);
        
    }
    
}
