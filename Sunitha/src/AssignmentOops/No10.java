package AssignmentOops;

public class No10 {
    public static void main(String[] args) {
        Employee e=new Employee("Robert", 1994,64 , "C- WallsStreat");
        Employee e1=new Employee("Sam", 2000,68 , "D- WallsStreat");
        Employee e2=new Employee("John", 1997,26 , "B- WallsStreat");
        System.out.println("Name     Year of joining  Salary Address");
        e.Robert();
        e1.Sam();
        e2.John();
    }
}
    
    class Employee {
    //name, year of joining, salary, address
        int year, salary;
        String name, address;
        Employee(String n,int y,int s, String a){
            year=y; salary=s; name=n; address=a;
        }
        void Robert(){
            System.out.println(name+ "        "+year+"         "+salary+" "+address);
        }
        void Sam(){
            System.out.println(name+ "          "+year+"            "+salary+" "+address);
        }
        void John(){
            System.out.println(name+ "         "+year+"           "+salary+" "+address);
        }
    }
