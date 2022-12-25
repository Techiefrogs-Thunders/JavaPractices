package InheritanceAssignments;

public class Members {
    public static void main(String[] args) {
        Employee employee = new Employee("jyothi",21,"8734562037","uyregtfbdhfysergf", 500000.5,"CSE");
        Manager manager = new Manager("Akhila", 22, "8374658765", "jefghkurhb", 600000, "B.E");
        employee.printSalary();
        manager.printSalary();
    }
}
class Member{
    String Name;
    int Age;
    String Phonenumber;
    String Address;
    double Salary;
    Member(String name, int age, String Phonenumber, String Address, double Salary){
        this.Name = name;
        this.Age = age;
        this.Phonenumber = Phonenumber;
        this.Salary = Salary;

    }
    void printSalary(){
        //long Salary = 30000;
        System.out.println("salary is: "+Salary);
        System.out.println("name is: "+Name);
        System.out.println("age is: "+Age);
        System.out.println("phonenumber is: "+Phonenumber);
    }
}
class Employee extends Member{
    String Specialization;
    Employee(String name, int age, String Phonenumber, String Address, double Salary, String specialization){
        super(name, age, Phonenumber, Address, Salary);
    this.Specialization = specialization;
    System.out.println("specialization is: "+Specialization);
    }

}
class Manager extends Member{
    String Department;
    Manager(String name, int age, String Phonenumber, String Address, double Salary, String department){
        super(name, age, Phonenumber, Address, Salary);
        this.Department = department;
        System.out.println("department is: "+Department);
    }

}
