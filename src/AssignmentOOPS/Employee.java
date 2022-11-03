package AssignmentOOPS;

import java.util.Scanner;

public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    void getDetails(Scanner obj){
        System.out.println("Enter employee name: ");
        name = obj.nextLine();
        System.out.println("Enter year of joining: ");
        yearOfJoining = obj.nextInt();
        System.out.println("Enter salary: ");
        salary = obj.nextDouble();
        System.out.println("Enter address : ");
        obj.nextLine();
        address = obj.nextLine();
    }

    void showDetails(){
        System.out.println(name +"        "+ yearOfJoining +"            "+ salary +"      "+ address);

    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.getDetails(obj);
        emp2.getDetails(obj);
        emp3.getDetails(obj);
        System.out.println("Name       Year Of Joining     Salary      Address");
        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();

    }

}