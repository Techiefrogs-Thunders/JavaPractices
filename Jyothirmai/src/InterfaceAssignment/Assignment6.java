package InterfaceAssignment;

public class Assignment6 {
    public static void main(String[] args) {
        first obj = new first();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
        obj.method7();
        obj.method8();
    }
}
interface one{
    void method1();
    void method2();
}
interface two{
    void method3();
    void method4();
}
interface three{
    void method5();
    void method6();
}
interface four extends one,two,three{
    void method7();
}
class second{
    void method8(){
        System.out.println("In method8");
    }
}
class first extends second implements four{
    public void method1() {
        System.out.println("In method1");
    }
    public void method2() {
        System.out.println("In method2");
    }
    public void method3() {
        System.out.println("In method3");
    }
    public void method4() {
        System.out.println("In method4");
    }
    public void method5() {
        System.out.println("In method5");
    }
    public void method6() {
        System.out.println("In method6");
    }
    public void method7() {
        System.out.println("In method7");
    }

}