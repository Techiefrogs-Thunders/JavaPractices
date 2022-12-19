package MethodsAssignment;

public class meth {
    public static void main(String[] args) {
        meth obj = new meth();
        obj.sum(45, 'j');
        obj.sum('y',6);
    }
    void sum(int a,char name){
        System.out.println(a);
        System.out.println(name);
    }
    void sum(char name,int a){
        System.out.println(name);
        System.out.println(a);
    }
}
