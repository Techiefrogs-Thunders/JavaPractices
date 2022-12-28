package InterfaceAssignment;

public class Assignment2<person> {
    public static void main(String[] args) {
        Employee[] employee= new Employee[5];
        employee[0] = new Employee("jsdhgf", 3746);
        employee[1] = new Employee("kdjfkyte", 73465);
        employee[2] = new Employee("auweygyg", 73564);
        employee[3] = new Employee("kuerhjfb", 3746);
        employee[4] = new Employee("uyrgfiureh", 84365);
        //employee[5] = new Employee("uekrhjfbuyg", 984756);
        
        System.out.println(average(employee));
        }
    static double average(Employee[] obj){
        double sum = 0;
        double average;
        if(obj.length==0){
            return 0;
        }
        
        for(Employee obj1:obj){
            double measure = obj1.getMeasure();
            sum = sum+measure;
        }
        average = sum/obj.length;
        return average;
    }
}
interface Measurable{
    double getMeasure();
}
class Employee implements Measurable{
    String name;
    double Salary;
    Employee(String Name, double salary){
        name = Name;
        Salary = salary;
    }
    public double getMeasure() {
        return Salary;
    }
    
}
