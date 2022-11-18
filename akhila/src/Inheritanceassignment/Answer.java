package Inheritanceassignment;

public class Answer {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.Name="Akhila";
        e.age=25;
        e.phonenum="9865748999";
        e.address="xyxyxy";
        e.salary=550000;
        e.specialization="xyz";
        e.display();
        Manager m=new Manager();
        m.Name="Akhil";
        m.age=30;
        m.phonenum="asjgdsa";
        m.salary=2000000;
        m.address="abcdabcd";
        m.department="sales";
        m.display();
    }
}
class Member
{
    String Name;
    String address;
    int age;
    int salary;
    String phonenum;
    public void printSalary()
    {
        System.out.println("Salary: "+salary);
    }
}
class Employee extends Member{
    String specialization;
    void display()
    {
        System.out.println("Employee name:"+Name);
        System.out.println("Employee age: "+age);
        System.out.println("Employee Phonenum: "+phonenum);
        System.out.println("Employee address: "+address);
        System.out.println("employee salary: "+salary);
        System.out.println("Employee specialization: "+specialization);
    }
}
class Manager extends Member{
    String department;
    void display()
    {
        System.out.println("name:"+Name);
        System.out.println(" age: "+age);
        System.out.println("Phonenum: "+phonenum);
        System.out.println("address: "+address);
        System.out.println("salary: "+salary);
        System.out.println("department: "+department);
        
    }
}