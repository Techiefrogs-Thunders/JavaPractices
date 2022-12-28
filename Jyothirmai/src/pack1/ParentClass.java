package pack1;

public class ParentClass extends GrandParentClass{
    int l = 20;
    String str = "jyothi";

    void display(){
        System.out.println("in parent display method");
    }
    //private int j = 400;

    ParentClass(){
       super();
        System.out.println("in parent constructor");
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
