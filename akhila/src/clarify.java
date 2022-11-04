public class clarify {
    int i;
    byte b;
    short s;
    long l;
    boolean flag;
    float f;
    double d;
    char ch;
    void meth1()
    {
        System.out.println("int default value is : "+i);
        System.out.println("byte default value : "+b);
        System.out.println("short default value : "+s);
        System.out.println("long default value : "+l);
        System.out.println("boolean default value : "+flag);
        System.out.println("float default value : "+f);
        System.out.println("double default value : +"+d);
        System.out.println("char default value : "+ch);
        System.out.println("char default value won't be displayed");
    }
    public static void main(String[] args)
    {
        System.out.println("start");
        clarify cobj=new clarify();
        cobj.meth1();
    }

}
