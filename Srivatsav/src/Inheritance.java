import java.util.Scanner;

class Person {
        
    String firstname;
    String lastname;
  
    public void setFirstName(String firstname) {
      this.firstname = firstname;
    }
      
    public void setLastName(String lastname) {
      this.lastname = lastname;
    }
}
      
class Employee extends Person {
    String id;
    int payscale;
    String joiningDate;
    String id1;
      
    Employee(String firstname, String lastname, String employeeid, int payscale, String joiningDate) {
          
        this.setFirstName(firstname);
        this.setLastName(lastname);

        this.id1 = employeeid;
        this.payscale = payscale;
        this.joiningDate = joiningDate;
    }
      
    public void showDetail() {
        System.out.println("Employee details:");
        System.out.println("EmployeeID: " + this.id);
        System.out.println("First name: " + this.firstname);
        System.out.println("Last name: " + this.lastname);
        System.out.println("Pay scale: " + this.payscale);
        System.out.println("Joining Date: " + this.joiningDate);
    }
}
    
public class Inheritance {
            
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Employee Details: ");
        System.out.println("Enter Firstname:");
        String firstname = obj.next();  
        //String firstname = "Srivatsav";
        System.out.println("Enter Lastname: ");
        String lastname = obj . next();
        //String lastname = "Lakamsani";
        System.out.println("Enter ID: ");
        String id = obj . next();
        //String id = "101";
        System.out.println("Enter Payscale: ");
        int payscale = obj . nextInt();
        //int payscale = 3;
        System.out.println("Enter Joingdate: ");
        String joiningdate = obj . next();
        //String joiningDate = "01-01-2022";
      
        Employee empObj = new Employee(firstname, lastname, id, payscale, joiningdate);
      
        empObj.showDetail();
      
        }
}