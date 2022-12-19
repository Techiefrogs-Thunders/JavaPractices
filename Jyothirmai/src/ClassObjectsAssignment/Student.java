package ClassObjectsAssignment;

public class Student {
    
    Student(String name,int roll_no, String phone_number, String address){
        System.out.println(name+"  "+roll_no+"  "+phone_number+"  "+address);

    }
    public static void main(String[] args) {
       
        new Student("John",2,"9381329985","Ramalayam street duddukuru");
        new Student("sam",3,"7799574574","high school road duddukuru");
       
       }
}
