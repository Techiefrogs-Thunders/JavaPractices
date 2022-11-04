package constructorsassignment;

public class Employee {
    public Employee(String name,int year,float salary,String address)
    {
        
        System.out.println(name+"  "+year+"   "+address);
    }
    public static void main(String[] args) {
        System.out.println("Name  "+" Year of joining "+" Address ");
        new Employee("Robert",1994,1500000,"64C-WallsStreat");
        new Employee("Sam   ",2000,2500000,"68D-WallsStreat");
        new Employee("John  ",1999,1800000,"26D-WallsStreat");
    }
}
