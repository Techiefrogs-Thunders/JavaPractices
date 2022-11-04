package AssignmengsMethods;

public class Static {
    public static void Parent() {
        System.out.println("parent method");
        
    }
    public static void main(String[] args) {
        Static nu=new Number();
        Number n=new Number();
        nu.Parent();
       // Number.child();
        n.child();
    }
}
class Number extends Static{
public static void child() {
    System.out.println("child method");   
}
}