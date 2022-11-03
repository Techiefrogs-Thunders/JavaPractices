package Inheritance;

public class Manager extends Member {  //Inheritance 3
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department){
        super(name, age, phoneNumber, address, salary);
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Department: "+ department);
    }
}
    

