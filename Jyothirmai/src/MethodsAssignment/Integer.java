package MethodsAssignment;

public class Integer {
    public static void main(String[] args) {
        member obj = new member();
        member1 obj1 = new member1();
        obj.printNum(5687);
        obj1.printNum(85976);
    }
}
class member{
    void printNum(int i){
        System.out.println("i value is : "+i);
    }
}
class member1{
    void printNum(int j){
        System.out.println("j value is : "+j);
    }
}
