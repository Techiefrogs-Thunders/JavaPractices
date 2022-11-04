package assignmentsInheritance;

public class Member {
    public static void main(String[] args) {
        Employee em=new Employee();
        em.memebrsDetails("John", "United state ");
        em.memebrsDetails(29, 8887655);
        em.memebrsDetails();
        em.printSalary();

        Manager man=new Manager();
        man.memebrsDetails("alex", "texas");
        man.memebrsDetails(28, 65436540);
        man.memebrsDetails();
        
    }
    
}

class Members{
String Name;
int Age;
int phoneNumber;
String Address;
double Salary=999999.23;

public void printSalary(){
    System.out.println("salary: "+Salary);
}
}

class Employee extends Members{
    String specialization="Java developer";
    String department="Software developing";
    
void memebrsDetails(String name, String address){
System.out.println("Name: "+name +", and address: "+address);

}
void memebrsDetails(int age, int phoneNumber){
    System.out.println("Age: "+age+", Phone No: "+ phoneNumber);

}
void memebrsDetails(){
System.out.println("spcilization: "+ specialization +", and department: "+ department);
System.out.println("-----------------------------------------------------");

}

}

class Manager extends Members{
    String specialization= "Application Tester";
    String department="delivery managment";
void memebrsDetails(String name, String address){

System.out.println("Name: "+name +", and address: "+address);

}
void memebrsDetails(int age, int phoneNumber){
    System.out.println("Age: "+age+", Phone No: "+ phoneNumber);

}
void memebrsDetails(){
System.out.println("Specalization: "+ specialization +", and department: "+ department);
}

}
