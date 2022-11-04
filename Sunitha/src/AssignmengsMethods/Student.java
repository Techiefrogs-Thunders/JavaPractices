package AssignmengsMethods;

public class Student {
    public static void main(String[] args) {
        DetailsOfStudent ds=new DetailsOfStudent();
        DetailsOfStudent ds1=new DetailsOfStudent(0);
        DetailsOfStudent ds2=new DetailsOfStudent("unknown", "not available");
        ds.setInfo(10, null);
       ds.setInfo(10, "john", "canada");
       ds.setInfo(0, null);
    }
    
}

class DetailsOfStudent{
    int age;
    String name, address;
    
    DetailsOfStudent(){
        System.out.println("Printing Details of students");
        this.name="null";
        this.age=0;
        this.address="unknown";
    }
    DetailsOfStudent(int age){
        this.age=age;
        System.out.println("Printing age of students:- "+ age);
    }
    DetailsOfStudent(String name, String address){
        this.name=name;
        this.address=address;
        System.out.println("Printing name of students: "+name+", Address of "+name+":- "+address);
    }
    void setInfo(int age,String name){
    System.out.println(name+" and "+ age);
    this.age=age;
    this.name=name;

}
    
void setInfo(int age,String name, String address){
    System.out.println(name+", age:  "+ age+ ", and aadress: "+ address);
this.age=age;
this.name=name;
this.address=address;
}
}
