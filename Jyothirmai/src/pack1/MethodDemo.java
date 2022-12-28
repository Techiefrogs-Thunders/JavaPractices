package pack1;

public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo meth = new MethodDemo();
        int sum= meth.sum();
        System.out.println("the sum of values is "+sum);
        meth.display();
    }

    void display(){
        System.out.println("user defined");
    }

    int sum(){
        return 5+10;
    }
    String myMethod(){
        System.out.println("hi");
        return "abc";
    }
}
