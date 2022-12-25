package InheritanceAssignments;

public class Assignment3 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(46, 98);

        
    }
}
class A{
    int i;
    int j;
    A(){
        System.out.println("In constructor");
    }
    void show(int i,int j){
        this.i = i;
        this.j = j;
        System.out.println("In method");
    }
}
class B extends A{
    int k;
    B(){
        System.out.println("in B constructor");
    }
    void show(int i, int k){
        this.i=i;
        this.k = k;
        System.out.println(k);

    }

}
