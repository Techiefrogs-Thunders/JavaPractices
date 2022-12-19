package MethodsAssignment;

public class Degree {
    
    public static void main(String[] args) {
        Degree obj = new Degree();
        Undergraduate obj1 = new Undergraduate();
        Postgraduate obj2 = new Postgraduate();
        obj.getDegree();
        obj1.getDegree();
        obj2.getDegree();
        
    }
    void getDegree(){
        System.out.println("i got a degree");
    }
}
class Undergraduate{
    void getDegree(){
        System.out.println("i am undergraduate");
    }
}
class Postgraduate{
    void getDegree(){
        System.out.println("i am postgraduate");
    }
}