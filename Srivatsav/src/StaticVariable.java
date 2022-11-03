public class StaticVariable {
    static int age;
    static String name;
    public static void main(String args[]){
	    age = 30;
	    name = "Steve";
        details();
    }
    static void details(){
        System.out.println("Age is: "+age);
        System.out.println("Name is: "+name);
    }
    
}
