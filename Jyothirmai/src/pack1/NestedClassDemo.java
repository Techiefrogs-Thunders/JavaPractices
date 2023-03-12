package pack1;

public class NestedClassDemo {
    static int x = 10;
    int y = 20;
    private int z = 30;
    int num;
    public static void main(String[] args) {
        NestedClassDemo outerobj = new NestedClassDemo();
        NestedClassDemo.innerClass innerobj = outerobj.new innerClass();
        innerobj.display();
        innerobj.print();
    }

    class innerClass{
        void display(){
            System.out.println("outer static member: "+x);
            System.out.println("outer instance member: "+y);
            System.out.println("outer private member: "+z);
        }

        public void print(){
            System.out.println("this is an inner class");
        }
    }
}
