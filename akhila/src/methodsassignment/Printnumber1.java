package methodsassignment;

public class Printnumber1 {
    void meth1(int n,char c)
    {
        System.out.println("The integer is "+n+"\t character is "+c);
        
    }
    void meth1(char c,int n)
    {
        System.out.println("The character is "+c+"\t integer is "+n);
        
    }
    public static void main(String[] args) {
        Printnumber1 print= new Printnumber1();
        print.meth1(5,'a');
        System.out.println("==========");
        print.meth1('b',10);
    }
}
