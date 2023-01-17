package TreeSetAssign;
import java.util.*;
public class P18 {
    public static void main(String[] args) {
        TreeSet<Employee> ts1=new TreeSet<>((Employee e1,Employee e2)->(e1.name).compareTo(e2.name));
        ts1.add(new Employee(1,"akhila",24));
        ts1.add(new Employee(2,"kakarla",23));
        ts1.add(new Employee(3,"jv",56));
        ts1.add(new Employee(4,"ghjvhjv",34));
        for(Employee e:ts1){
            System.out.println(e);
        }
        TreeSet<Employee> ts2=new TreeSet<>((Employee e1,Employee e2)->(e1.name).compareTo(e2.name));
        ts2.add(new Employee(1,"wdgwhq",24));
        ts2.add(new Employee(2,"jhvdhwv",23));
        ts2.add(new Employee(3,"hwvdhwv",56));
        ts2.add(new Employee(4,"jqhvdjqwv",34));
        for(Employee e:ts2){
            System.out.println(e);
        }
    }
}
class Employee{
    public int id;
    public String name;
    public Integer age;
    Employee(){}
    Employee(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return " "+this.id+" "+this.name+" "+this.age;
    }
    }
