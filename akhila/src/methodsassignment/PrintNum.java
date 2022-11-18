package methodsassignment;
class I{
    int i;
    void printNum()
    {
        System.out.println("The value of i is: "+i);
    }
}

class J extends I{
    int j;
    void printNum()
    {
        System.out.println("The value of j is: "+j);
    }}
    public class PrintNum
    {
    public static void main(String[] args) {
        J a=new J();
        a.i=5;
        a.j=7;
        a.j=a.i;
        a.printNum();
        
        
    }
}
