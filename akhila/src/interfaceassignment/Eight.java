package interfaceassignment;

public class Eight implements InterfaceA{
    public void meth1(){
        InterfaceA.Innerclass IC=new InterfaceA.Innerclass();
        IC.meth1();
        System.out.println("meth1() from main class");
    }
        public static void main(String[] args) {
            Eight inr=new Eight();
            inr.meth1();
        }
    }
interface InterfaceA{
    public abstract void meth1();
    static class Innerclass implements InterfaceA{
        public void meth1(){
            System.out.println("meth1() from inner class");
        }
    }
}