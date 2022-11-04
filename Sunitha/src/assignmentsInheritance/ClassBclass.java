package assignmentsInheritance;

public class ClassBclass {
    public static void main(String[] args) {
        ClassB b=new ClassB(12);
        ClassA a=new ClassA(11, 99);
        b.show();
        
    }
}

class ClassA{
    int i,j;
    ClassA(int k, int l){
        this.i=k;
        this.j=l;
        System.out.println("Class A constructor");
    }
    void show(){
        System.out.println("class A method"+ i+" "+j);
    }
}

class ClassB extends ClassA{
    int m;
    ClassB(int m){
        super(11, 22);
        System.out.println("Class B Constructor");
    }
    void show(){
        System.out.println("Class B method "+ m);
        //super.show();

    }

}
