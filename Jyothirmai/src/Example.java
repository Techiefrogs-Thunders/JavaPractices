public class Example {
    public static void main(String[] args) {
        int a = 4875;
        int b = 94875;
        int c = a+b;
        System.out.println(c);
        Example obj1 = new Example();
        obj1.obj();

    }
    void obj(){
        System.out.println("In method");
    }
}
