package interfaceassignment;

public class Six {
    

    public static void main(String[] args) {
        ClassB cb=new ClassB();
        cb.meth1();
        cb.meth2();
        cb.meth3();
        cb.meth4();
        cb.meth5();
        cb.meth6();
        cb.meth7();
        cb.meth8();
    }
}
interface Interface1{
    void meth1();
    void meth2();
}
interface Interface2{
    void meth3();
    void meth4();
}
interface Interface3{
    void meth5();
    void meth6();
}
interface Interface4 extends Interface1,Interface2,Interface3{
    void meth7();
}
class ClassA{
    void meth8()
    {
    
        System.out.println("meth8()");
    }
}
class ClassB extends ClassA implements Interface4{
    public void meth1(){
        System.out.println("meth1()");
    }
    public void meth2(){
        System.out.println("meth2()");
    }
    public void meth3(){
        System.out.println("meth3()");
    }
    public void meth4(){
        System.out.println("meth4()");
    }
    public void meth5(){
        System.out.println("meth5()");
    }
    public void meth6(){
        System.out.println("meth6()");
    }
    public void meth7(){
        System.out.println("meth7()");
    }
    public void meth8(){
        System.out.println("meth8()");
    }
}
