package Interface;

interface Prove
{
    int x=10;                                 
    // final int y;                         
    public int z=100;                     
    static void method()
    {
        System.out.println("hi ");
    }
}
public class Interface4 implements Prove{      
    public static void main(String[] args) {
        System.out.println(x);
        Prove.method();                      
        System.out.println(Prove.z); 
        int z=200;
        System.out.println(z);
    }
}

    

