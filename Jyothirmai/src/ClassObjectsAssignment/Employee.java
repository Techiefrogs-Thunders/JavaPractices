package ClassObjectsAssignment;

public class Employee {
    String name;
    int year;
    String address;
    Employee(String NAME,int YEAR,String ADDRESS){
        System.out.println(NAME+"     "+YEAR+"     "+ADDRESS);
    }
   
    public static void main(String[] args) {
        System.out.println("name"+"    "+"year"+"   "+"address");
        Employee e1 = new Employee("Robert",1994,"64C-WallsStreat");
        Employee e2 = new Employee("Sam",2000,"68D-WallsStreet");
        Employee e3 = new Employee("John",1999,"26B-WallsStreat");
        
    }
}
