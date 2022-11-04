public class ClassB 
{
    public void variable()
    {
        int i=1;
        int a=8;
        System.out.println(a);
        for(i=1;i<5;i++)
        {
            int c=3;
            System.out.println("it's possible"+c);
        }
        while(i<2)
        {
            int c=5;
            System.out.println("it's possible"+c);
        }
        
        if(a>0)
        {
            int b=6;
            System.out.println("it's possible"+b);
        }
    
    }
        public static void main(String[] args) {
            new ClassB().variable();
        }
    
}