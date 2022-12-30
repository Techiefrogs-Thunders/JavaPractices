
public class Example {
    int a = 5;
        int b = 7;
    public static void main(String[] args) {
        
        Example obj1 = new Example();
        obj1.display();

    }
    void display(){
        System.out.println("In method");
        System.out.println(a+b);
    }
}
