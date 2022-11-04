public class methodoverloading {
    public final static void meth1()
    {
        System.out.println(10);
    }
    public final static void meth1(int n)
    {
        System.out.println(20);
    }
    private int meth1(String s,int a)
    {
        System.out.println("This is the string message");
        return a;
    }
    protected void meth1(char a)
    {
        System.out.println("A");
    }
    public static void main(String[] args) {
        meth1();
        meth1(5);
        new methodoverloading().meth1("akhila",5);
        new methodoverloading().meth1('A');
    }
}
