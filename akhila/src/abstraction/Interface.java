package abstraction;

public class Interface implements InterfaceA{
    
    public static void main(String[] args) {
        Interface i=new Interface();
        i.diaplay();
        
    }
    @Override
    public void diaplay() {
        // TODO Auto-generated method stub
        System.out.println("display() method ");
    }
}
interface InterfaceA
{
    final int a=10;
    void diaplay();   
}

//to achieve total abstraction and are used to implement abstraction.
//supperts multiple inheritance
