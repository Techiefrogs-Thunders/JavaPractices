public class Example {
    int a =5;
    int b=7;
    public static void main(String[] args) {
        Example e=new Example();
        e.display();
    }
    void display(){
        System.out.println("In display() method");
        System.out.println(a+b);
        
        System.out.println(a-b);
    }
}
