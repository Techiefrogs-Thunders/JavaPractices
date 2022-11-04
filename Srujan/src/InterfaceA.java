public interface InterfaceA {
    //public default void meth1() {} //(or)
    void meth1();//abstract method
    default void meth2()
    {	
    System.out.println("default method of InterfaceA");
    }
    static void meth3()
    {
    System.out.println("static method of InterfaceA");	
    }
    public static void main(String[] args) {
        InterfaceA.meth3();
    }	
        
        
    }