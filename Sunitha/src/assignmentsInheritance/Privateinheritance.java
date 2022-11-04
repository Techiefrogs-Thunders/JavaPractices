package assignmentsInheritance;

public class Privateinheritance {
    public static void main(String[] args) {
        System.out.println("parent calss expression");
        SubChild sc=new SubChild();
        Parent pp=new SubChild();
        sc.employee();
       //pp.employee();
    }  
    }
class Parent{
    private void employee(){
        System.out.println("this is parent class");
    }
}
class Child extends Parent {
    
    void employee(){
        System.out.println("this is child class"); 
        super.employee();    
}
}
class SubChild extends Child {
    void employee(){
        System.out.println("this is Subchild class"); 
        super.employee();  
}

}


