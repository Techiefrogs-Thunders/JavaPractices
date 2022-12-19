package MethodsAssignment;

public class Student {
    String name="unknow";
    int age=0;
    String address="not available";
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setInfo("jyothi", 21);
        obj.setInfo("jyothi", 21, "skdfjg");
    }
    void setInfo(String name,int age){
        System.out.print(name+" ");
        System.out.print(age+" ");
        System.out.println(address);

    }
    void setInfo(String name,int age,String address){
        System.out.print(name+" ");
        System.out.print(age+" ");
        System.out.print(address+" ");
    }
}
