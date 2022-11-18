package methodsassignment;

public class PrintNumber {
    void printn(int i)
    {
        System.out.println(i);
    }
    void printn(String s)
    {
        System.out.println(s);
    }
    void printn(float f)
    {
        System.out.println(f);
    }
    void printn(double d)
    {
        System.out.println(d);
    }
    
    void printn(boolean b)
    {
        System.out.println(b);
    }
    void printn(char ch)
    {
        System.out.println(ch);
    }

    public static void main(String[] args) {
        PrintNumber print=new PrintNumber();
        print.printn(4);
        print.printn("akhila kakarla");
        print.printn(23.00f);
        print.printn(352352.25325);
        print.printn(true);
        print.printn("A");
    }
}
