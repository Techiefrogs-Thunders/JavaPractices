package pack1;


class OuterClass{
    static int outerx = 10;
    int outery = 20;
    private static int outerprivate = 30;
    static class StaticNestedClass{
        void displaymethod(){
            System.out.println("outer x: "+outerx);
            System.out.println("outer private: "+outerprivate);
        }
    }
}

public class StaticNestedClassDemo {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass obj10 = new OuterClass. StaticNestedClass();
        obj10.displaymethod();
      
       
    } 
}