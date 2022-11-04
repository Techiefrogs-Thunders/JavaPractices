public class ClassA {
    int x=10;
    static int y=2;
    public ClassA()
    {
        x=65;
        int z=x;
        System.out.println(z);
        System.out.println("non-parametrised ClassA constructor is executed");
    }
    public ClassA(int x)
    {
       
        int z=x;
        System.out.println(z);
        
        System.out.println("parametrised ClassA constructor is executed");
    }
    void sum(){
        int y=4;
        int z=x+y;
        //int i;
        System.err.println("This is my error message");
        System.out.println("The sum of two numbers is :"+z);
        
    }
    public static void main(String[] args) {
        System.out.println("main() program started ");
        
       new ClassA().sum();
        new ClassA(10);
        System.out.println("main() program executed");
    }
}
    

