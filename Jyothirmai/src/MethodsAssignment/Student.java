package MethodsAssignment;

import javax.sql.rowset.spi.SyncResolver;

public class Student {
    Student(){
        String name = "unknown";
        int age = 0;
        String address = "not available";
    }
    public static void main(String[] args) {
        Student obj = new Student();
        //obj.setInfo("jyothi", 21);
        obj.setInfo("jyothi", 21, "skdfjg");
        obj.setInfo("Akhila", 21, "uyhrfb");
        obj.setInfo("lasya", 22, "uehjfbehf");
    }
    void setInfo(String name,int age){
        System.out.print(name+" ");
        System.out.print(age+" ");
        //System.out.println(address);

    }
    void setInfo(String name,int age,String address){
        System.out.print(name+" ");
        System.out.print(age+" ");
        System.out.print(address+" ");
        System.out.println();
    }
}
