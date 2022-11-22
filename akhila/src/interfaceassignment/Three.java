package interfaceassignment;

import student.*;

public class Three {
    public static void main(String[] args) {
        Test t=new Test();
    t.RollNo();
    t.course();
    t.marks();
    }
}
class Test implements Students{
    public void RollNo(){
        System.out.println("18567");
    }
    public void course()
    {
        System.out.println("OOPS");
    }
    public void marks()
    {
        System.out.println("86");
    }
}