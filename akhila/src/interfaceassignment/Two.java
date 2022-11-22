package interfaceassignment;

public class Two {
    public static double average(Employee[] objects){
        double average;
        double sum=0;
        if(objects.length==0)
        {
            return 0;
        }
        for(Employee obj:objects){
            double measure=obj.getMeasure();
            sum=sum+measure;
        }
        average=sum/objects.length;
        return average;
    }
    public static void main(String[] args) {
        Employee[] emp=new Employee[5];
        emp[0]=new Employee("akhila",65000);
        emp[1]=new Employee("kakarla",75000);
        emp[2]=new Employee("dwdedwede",878788);
        emp[3]=new Employee("hdbd",8737777);
        emp[4]=new Employee("wdwldjwkd",2344444);
        
        System.out.println(average(emp));
    }
}
interface Measurable
{
    
    abstract double getMeasure();
}
class Employee implements Measurable{
    private double salary;
    private String name;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public double getMeasure() {
        // TODO Auto-generated method stub
        return salary;
    }
}