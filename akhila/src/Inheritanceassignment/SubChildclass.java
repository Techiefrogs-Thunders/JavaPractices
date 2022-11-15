package Inheritanceassignment;

public class SubChildclass {
    public static void main(String[] args) {
    
        Parentclass parent=new Childclass();
        Childclass child=new Childclass();
        parent.meth1();
        child.meth2();
        child.meth1();
    } 
}
class Childclass extends Parentclass{
    void meth2()
    {
        System.out.println("This is child class");
    }
}
class Parentclass
{
    private void meth1()
    {
        System.out.println("This is parent class");
    }
}